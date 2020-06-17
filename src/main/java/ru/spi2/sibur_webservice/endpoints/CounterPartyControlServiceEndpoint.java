package ru.spi2.sibur_webservice.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.spi2.jaxws.datatypes.CISTask;
import ru.spi2.jaxws.datatypes.CheckAndSaveRegistrCounterpartySRMAsync;
import ru.spi2.jaxws.datatypes.CheckAndSaveRegistrCounterpartySRMAsyncResponse;
import ru.spi2.jaxws.datatypes.ConcurrentProcedureConclusionRequestAsync;
import ru.spi2.jaxws.datatypes.ConcurrentProcedureConclusionRequestAsyncResponse;
import ru.spi2.jaxws.datatypes.Contract;
import ru.spi2.jaxws.datatypes.ContractConclusionRequestAsync;
import ru.spi2.jaxws.datatypes.ContractConclusionRequestAsyncResponse;
import ru.spi2.jaxws.datatypes.Counterparty;
import ru.spi2.jaxws.datatypes.Header;
import ru.spi2.jaxws.datatypes.ObjectFactory;
import ru.spi2.jaxws.datatypes.PutContractStatus;
import ru.spi2.jaxws.datatypes.PutContractStatusResponse;
import ru.spi2.jaxws.datatypes.PutCounterpartyInfo;
import ru.spi2.jaxws.datatypes.PutCounterpartyInfoResponse;
import ru.spi2.jaxws.datatypes.PutHistoricalContracts;
import ru.spi2.jaxws.datatypes.PutHistoricalContractsResponse;
import ru.spi2.jaxws.datatypes.SyncResponse;
import ru.spi2.sibur_webservice.constants.ResultCodesEnum;
import ru.spi2.sibur_webservice.entities.SpiWsRawData;
import ru.spi2.sibur_webservice.repositories.BankDetailEntityRepository;
import ru.spi2.sibur_webservice.repositories.ContractEntityRepository;
import ru.spi2.sibur_webservice.repositories.SpiWsRawDataRepository;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;


@Endpoint
public class CounterPartyControlServiceEndpoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(CounterPartyControlServiceEndpoint.class);

	@Resource
	private BankDetailEntityRepository bankDetailEntityRepository;

	@Resource
	private ContractEntityRepository contractEntityRepository;

	@Resource
	private SpiWsRawDataRepository spiWsRawDataRepository;

	/**
	 * Создаем в бд серверную информацию о поступившем запросе:
	 *
	 * @param jaxbElement объект в обертке, поступивший на сервер в параметре реквеста.
	 */
	private void writeRequestDataInfoToDb(JAXBElement jaxbElement) throws JAXBException {

		StringWriter sw = new StringWriter();
		JAXBContext context = JAXBContext.newInstance(jaxbElement.getDeclaredType());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(jaxbElement.getValue(), sw);
		String rawXmlBodyAsString = sw.toString();

		// В ячейке под индексом 1 - всегда имя текущего метода, а под индексом 2 - имя метода, вызвавшего текущий метод.
		String calledServiceMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();

		Date currentDateNow = new Date();
		SpiWsRawData spiWsRawData =
				new SpiWsRawData(currentDateNow, SpiWsRawData.ServiceMethod.valueOf(calledServiceMethodName),
								 rawXmlBodyAsString, SpiWsRawData.ProcessingStatus.INSERTED, currentDateNow);
		spiWsRawDataRepository.save(spiWsRawData);
	}

	//    /**
	//     * Метод, принимающий статус Договора с контрагентом для его обновления в системе.
	//     */
	//    @PayloadRoot(localPart = "PutContractStatus", namespace = "http://spi2.ru/jaxws/datatypes")
	//    @ResponsePayload
	//    //   public PutContractStatusResponse putContractStatus(@RequestPayload HeaderEntity headerEntity, @RequestPayload String contractId , @RequestPayload String approvalStage) {
	//    public JAXBElement<PutContractStatusResponse> putContractStatus(@RequestPayload JAXBElement<PutContractStatus> putContractStatusJAXBElement
	//            , MessageContext messageContext) {
	//
	//        ContractEntity contractEntity = new ContractEntity();
	//        contractEntity.setApprovalStage("APPROVED");
	//
	////        contractEntityRepository.save(contractEntity);
	//
	//        SyncResponse syncResponse = new SyncResponse();
	//        syncResponse.setResultCode(ResultCodesEnum.success.name());
	//        syncResponse.setResultMessage("Ответ сформирован в " + new Date());
	//
	//        PutContractStatusResponse putContractStatusResponse = new PutContractStatusResponse();
	//        putContractStatusResponse.setResponseSync(syncResponse);
	//
	//        QName qName = new QName("http://spi2.ru/jaxws/datatypes", "PutContractResponse");
	//        JAXBElement<PutContractStatusResponse> jaxbElement = new JAXBElement<PutContractStatusResponse>(qName, PutContractStatusResponse.class, putContractStatusResponse);
	//
	//
	//
	//        writeRequestDataInfoToDb(messageContext);
	//        return jaxbElement;
	//    }

	/**
	 * ================= К И С ====================================
	 * /**********************************************************************************************************
	 * Метод, принимающий исторические данные о  Договоре с контрагентом и не требующий Заключений по договорам -
	 * только учет в ИАС "ПроверКА"
	 *
	 * @param putHistoricalContractsJAXBElement содержит
	 * @return
	 * @RequestPayload Header header,
	 * *                                            @RequestPayload Lis<Contract> - пакет историч. Договоров
	 */
	// @WebMethod(operationName = "PutHistoricalContracts")
	// @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	// Можно было бы использовать @InstanceResolverAnnotation и не переписывать на Spring
	@PayloadRoot(localPart = "PutHistoricalContracts", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	public JAXBElement<PutHistoricalContractsResponse> putHistoricalContracts(
			@RequestPayload JAXBElement<PutHistoricalContracts> putHistoricalContractsJAXBElement,
			MessageContext messageContext) {

		ObjectFactory objectFactory = new ObjectFactory();
		PutHistoricalContractsResponse handlerStatus = objectFactory.createPutHistoricalContractsResponse();
		String mess = "";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE

		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);

		if (putHistoricalContractsJAXBElement != null && putHistoricalContractsJAXBElement.getValue() != null) {

			//@ToDo  2. Валидация на not null и обязательные поля - сервис не сделан
			// Внимание. Это список, в xsd он не ограничен. Но нужно как то его size () ограничить величиноой пакета, в настройках
			// Иначе ограмное поле LOB будет/ Не забыть в ТЗ включить это ограничение


			//@ToDo 3.  ДЛЯ ИСТОРИЧ. ДАННЫХ НЕ НУЖНО !! Обновление записи телом почтового сообщения
			// ****


			//@ToDo 4. Сообщение для синхронного ответа
			Header header = putHistoricalContractsJAXBElement.getValue().getHeader();
			if (header != null) {
				mess += "Принято в обработку.  ";
				mess += " Запрос " + header.getRequestid() + " от " + header.getRequestdate();
				List<Contract> contracts = putHistoricalContractsJAXBElement.getValue().getContracts();
				if (contracts != null) {
					mess += " В пакете договоров  " + contracts.size();
				} else {
					mess += " Пустой пакет договоров";
				}
				handlerStatus.setResponseSync(syncResponse);
			} else {
				mess += " Запрос содержит пустой заголовок. ";
				syncResponse.setResultCode(ResultCodesEnum.failure.name());
			}

		} else {
			mess = " Пустой запрос";
			syncResponse = objectFactory.createSyncResponse();
			syncResponse.setResultCode(ResultCodesEnum.failure.name());

		}

		syncResponse.setResultMessage(mess);
		//@ToDo  5. Обновление записи по результатам валидации задачи
		// КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
		//статус         VALIDATION_SUCCESS или VALIDATION_FAULT
		//        soapMessageStageProcessService.updateAfterHandle(messageContext, syncResponse);
		try {
			writeRequestDataInfoToDb(putHistoricalContractsJAXBElement);
		} catch (JAXBException e) {
			String errorMessage = "Произошла ошибка при попытке преобразования объекта в xml-представление";
			LOGGER.info(errorMessage);
			handlerStatus.getResponseSync().setResultMessage(errorMessage);
		}
		return objectFactory.createPutHistoricalContractsResponse(handlerStatus);

	}

	/************************************************************************************************************
	 * Метод, принимающий запрос на асинхронную выдачу Заключения СБ при согласовании Договора с контрагентом
	 * @param contractConclusionRequestAsyncJAXBElement содержит
	 *                                                  @RequestPayload Header header,
	 *                                                  @RequestPayload CISTask cisTask - задание в КИС по согласованию Договора
	 * @return
	 */
	//  @WebMethod(operationName = "ContractConclusionRequestAsync")
	//  @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	@PayloadRoot(localPart = "ContractConclusionRequestAsync", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	public JAXBElement<ContractConclusionRequestAsyncResponse> contractConclusionRequestAsync(
			@RequestPayload JAXBElement<ContractConclusionRequestAsync> contractConclusionRequestAsyncJAXBElement,
			MessageContext messageContext) {

		ObjectFactory objectFactory = new ObjectFactory();
		ContractConclusionRequestAsyncResponse handlerStatus =
				objectFactory.createContractConclusionRequestAsyncResponse();
		String mess = "";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE
		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);

		if (contractConclusionRequestAsyncJAXBElement != null &&
			contractConclusionRequestAsyncJAXBElement.getValue() != null) {
			CISTask cisTask = contractConclusionRequestAsyncJAXBElement.getValue().getCisTask();

			//@ToDo  2. Валидация задаич КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
			//            syncResponse = validationCisTaskService.validate(cisTask); //
			handlerStatus.setResponseSync(syncResponse);

			//@ToDo 3.  Обновление записи телом почтового сообщения
			// ****


			//@ToDo 4. Сообщение для синхронного ответа
			mess = syncResponse.getResultMessage();
			Header header = contractConclusionRequestAsyncJAXBElement.getValue().getHeader();
			if (header != null) {
				mess += " Запрос " + header.getRequestid() + " от " + header.getRequestdate() + ".";

			} else {
				mess += " Запрос содержит пустой заголовок. ";
				syncResponse.setResultCode(ResultCodesEnum.failure.name());
			}

		} else {

			mess = " Пустой запрос";
			syncResponse = objectFactory.createSyncResponse();
			syncResponse.setResultCode(ResultCodesEnum.failure.name());

		}

		syncResponse.setResultMessage(mess);

		//@ToDo  5. Обновление записи по результатам валидации задачи
		// КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
		//статус         VALIDATION_SUCCESS или VALIDATION_FAULT
		//        soapMessageStageProcessService.updateAfterHandle(messageContext, syncResponse);

//		writeRequestDataInfoToDb(messageContext);
		return objectFactory.createContractConclusionRequestAsyncResponse(handlerStatus);
	}

	// @WebMethod(operationName = "PutContractStatus")
	// @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	@PayloadRoot(localPart = "PutContractStatus", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	//   public PutContractStatusResponse putContractStatus(@RequestPayload HeaderEntity headerEntity, @RequestPayload String contractId , @RequestPayload String approvalStage) {
	public JAXBElement<PutContractStatusResponse> putContractStatus(
			@RequestPayload JAXBElement<PutContractStatus> putContractStatusJAXBElement,
			MessageContext messageContext) {

		ObjectFactory objectFactory = new ObjectFactory();
		PutContractStatusResponse handlerStatus = objectFactory.createPutContractStatusResponse();
		String mess = " ";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE
		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);

		if (putContractStatusJAXBElement != null && putContractStatusJAXBElement.getValue() != null) {

			// @ToDo 2. Валидация  на not null и обязательные поля, прочий ФЛК - тут всего 3 поля
			String contractId = putContractStatusJAXBElement.getValue().getContractId();
			String status = putContractStatusJAXBElement.getValue().getApprovalStage();
			if (contractId == null) {
				mess += " Получен пустой идентификатор контракта ";
				syncResponse.setResultCode(ResultCodesEnum.failure.name());
			}
			if (status == null) {
				mess += " Получен пустой статус ";
				syncResponse.setResultCode(ResultCodesEnum.failure.name());
			}

			Header header = putContractStatusJAXBElement.getValue().getHeader();
			if (header != null) {

				//@ToDo 3.  Обновление записи телом почтового сообщения
				// ****

				//@ToDo 4. Подготовка сообщения для синхронного ответа

				mess += " Получен новый статус " + status + " по  договору с идентификатором " + contractId + ". " +
						"Ответ сформирован в " + new Date();
				mess += " Запрос " + header.getRequestid() + " от " + header.getRequestdate() + ".";
				syncResponse.setResultMessage(mess);

			} else {
				mess += " Запрос содержит пустой заголовок. ";
				syncResponse.setResultCode(ResultCodesEnum.failure.name());
			}

		} else {
			mess = " Пустой запрос";
			syncResponse = objectFactory.createSyncResponse();
			syncResponse.setResultCode(ResultCodesEnum.failure.name());

		}

		syncResponse.setResultMessage(mess);
		handlerStatus.setResponseSync(syncResponse);

		//@ToDo  5. Обновление записи по результатам валидации задачи
		// КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
		//статус         VALIDATION_SUCCESS или VALIDATION_FAULT
		//        soapMessageStageProcessService.updateAfterHandle(messageContext, syncResponse);

		try {
			writeRequestDataInfoToDb(putContractStatusJAXBElement);
		} catch (JAXBException e) {
			String errorMessage = "Произошла ошибка при попытке преобразования объекта в xml-представление";
			LOGGER.info(errorMessage);
			handlerStatus.getResponseSync().setResultMessage(errorMessage);
		}
		return objectFactory.createPutContractStatusResponse(handlerStatus);
	}

	/**
	 * ================= Сообщения SAP SRM. Регистрация участника и cогласование участника на этапах конкуррентной процедуры  ========================
	 * //******<!--  -->
	 * <p>
	 * /*******************************************************************************************************
	 * Метод, принимающий сообщение о том , что контрагент подал заявку на регистрацию (в SAP SRM)
	 * с целью проведения проверки основных данных, предоставленных контрагентом
	 *
	 * @param checkAndSaveRegistrCounterpartySRMAsyncJAXBElement содержит Header,
	 *                                                           registrReqGuid - GUID заявки, его нужно вернуть в асинхр. ответе
	 *                                                           counterparty - контрагент (ИНН, ОКПО ..) эти реквизиты нужно проверит по простому тут же
	 *                                                           а по СПАРК в iRule и вернуть результат проверки в асинхронном ответе
	 * @return
	 */
	//    @WebMethod(operationName = "CheckAndSaveRegistrCounterpartySRM_Async")
	//    @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	//    public SyncResponse checkAndSaveRegistrCounterpartySRM_Async(@WebParam(name = "header") Header header,
	//                                                                 @WebParam(name = "registrreq_guid") String registrReqGuid,
	//                                                                 @WebParam(name = "counterparty") Counterparty counterparty) {
	@PayloadRoot(localPart = "CheckAndSaveRegistrCounterpartySRM_Async", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	public JAXBElement<CheckAndSaveRegistrCounterpartySRMAsyncResponse> checkAndSaveRegistrCounterpartySRM_Async(
			@RequestPayload JAXBElement<CheckAndSaveRegistrCounterpartySRMAsync> checkAndSaveRegistrCounterpartySRMAsyncJAXBElement,
			MessageContext messageContext) {
		ObjectFactory objectFactory = new ObjectFactory();
		CheckAndSaveRegistrCounterpartySRMAsyncResponse handlerStatus =
				objectFactory.createCheckAndSaveRegistrCounterpartySRMAsyncResponse();
		String mess = "";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE
		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);

		if (checkAndSaveRegistrCounterpartySRMAsyncJAXBElement != null &&
			checkAndSaveRegistrCounterpartySRMAsyncJAXBElement.getValue() != null) {
			Counterparty counterparty = checkAndSaveRegistrCounterpartySRMAsyncJAXBElement.getValue().getCounterparty();

			//@ToDo  2. Валидация задаич КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
			//            syncResponse = validationCntrService.validate(counterparty); //
			handlerStatus.setResponseSync(syncResponse);

			//@ToDo 3.  Обновление записи телом почтового сообщения
			// ****


			//@ToDo 4. Сообщение для синхронного ответа
			mess = syncResponse.getResultMessage();
			Header header = checkAndSaveRegistrCounterpartySRMAsyncJAXBElement.getValue().getHeader();


			mess += " Запрос " + header.getRequestid() + " от " + header.getRequestdate();

		} else {

			mess = " Пустой запрос";
			syncResponse = objectFactory.createSyncResponse();
			syncResponse.setResultCode(ResultCodesEnum.failure.name());

		}

		syncResponse.setResultMessage(mess);

		//@ToDo  5. Обновление записи по результатам валидации задачи
		//        soapMessageStageProcessService.updateAfterHandle(messageContext, syncResponse);

//		writeRequestDataInfoToDb(messageContext);
		return objectFactory.createCheckAndSaveRegistrCounterpartySRMAsyncResponse(handlerStatus);
	}


	/***************************************************************************************************************
	 * Метод, принимающий сообщение с данными (первый раз и обновления) о КА ,
	 * в том числе о регистрации КА в SAP SRM (Дата рег. в SAP, Рег. Номер в SAP)
	 * Метод должен быть вызван после того как реквизиты, предоставленные контрагентом прошли проверку
	 * @param putCounterpartyInfoJAXBElement содержит  header -
	 *                                       registrationRegrequestId  - Ид. успешного запроса о регистрации КА (по идее нужно только для первого сообщения
	 *                                       counterparty -
	 *                                       counterpartySapIdentities - Данные  о регистрации КА в SAP SRM (Дата рег. в SAP, Рег. Номер в SAP)
	 * @return
	 */
	//  @WebMethod(operationName = "PutCounterpartyInfo")
	//  @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	@PayloadRoot(localPart = "PutCounterpartyInfo", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	public JAXBElement<PutCounterpartyInfoResponse> putCounterpartyInfo(
			@RequestPayload JAXBElement<PutCounterpartyInfo> putCounterpartyInfoJAXBElement,
			MessageContext messageContext) {

		ObjectFactory objectFactory = new ObjectFactory();
		PutCounterpartyInfoResponse handlerStatus = objectFactory.createPutCounterpartyInfoResponse();
		String mess = "";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE
		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);

		Counterparty counterparty = putCounterpartyInfoJAXBElement.getValue().getCounterparty();

		//@ToDo  2. Валидация задаич КИС , ее Контракта, лиц Контракта на not null и обязательные поля, прочий ФЛК
		//        syncResponse = validationCntrService.validate(counterparty); //


		//@ToDo 3.  Обновление записи телом почтового сообщения
		// ****


		//@ToDo 4. Сообщение для синхронного ответа
		mess += " Получен контрагент с идентификатором " +
				putCounterpartyInfoJAXBElement.getValue().getCounterpartySapIdentities().getSapSrmId();
		mess += " Запрос " + putCounterpartyInfoJAXBElement.getValue().getHeader().getRequestid() + " от " +
				putCounterpartyInfoJAXBElement.getValue().getHeader().getRequestdate();
		syncResponse.setResultMessage(mess);

		handlerStatus.setResponseSync(syncResponse);

		//@ToDo  5. Обновление записи по результатам валидации задачи

//		writeRequestDataInfoToDb(messageContext);
		return objectFactory.createPutCounterpartyInfoResponse(handlerStatus);
	}

	//----------------------------- Этапы конкурентной процедуры ----------------------

	/*****************************************************************************
	 * Метод, который может быть вызван несколько раз для одной или разных групп участников
	 * во время проведения конкурентной процедуры.  По каждому участнику
	 * формируется отчет нового типа, формируется отсылается асинхронно ответ с Заключением,
	 * а сотрудник может его изменить
	 * В Заклюении указывается
	 * 1. Виза
	 * 2. Комментарии: 2.1. Наличие связи с участниками КП 2.2. Перечень связанных  sap_srm_id
	 * @param  concurrentProcedureConclusionRequestAsyncJAXBElement
	 *                                                  содержит header
	 *                                                  concurrentProcedure
	 * @return
	 */
	// @WebMethod(operationName = "ConcurrentProcedureConclusionRequestAsync")
	// @WebResult(name = "ResponseSync", targetNamespace = "http://spi2.ru/jaxws/datatypes", partName = "response")
	@PayloadRoot(localPart = "ConcurrentProcedureConclusionRequestAsync", namespace = "http://spi2.ru/jaxws/datatypes")
	@ResponsePayload
	public JAXBElement<ConcurrentProcedureConclusionRequestAsyncResponse> concurrentProcedureConclusionRequestAsync(
			@RequestPayload JAXBElement<ConcurrentProcedureConclusionRequestAsync> concurrentProcedureConclusionRequestAsyncJAXBElement,
			MessageContext messageContext) {
		ObjectFactory objectFactory = new ObjectFactory();
		ConcurrentProcedureConclusionRequestAsyncResponse handlerStatus =
				objectFactory.createConcurrentProcedureConclusionRequestAsyncResponse();
		String mess = "";
		SyncResponse syncResponse = objectFactory.createSyncResponse();
		syncResponse.setResultCode(ResultCodesEnum.success.name());

		// @ToDo  1. Сохранение по приему со статусом PERSIST_RAW_DATA_DONE
		//        soapMessageStageProcessService.saveBeforeHandle(messageContext);
		//@ToDo 3.  Обновление записи телом почтового сообщения
		// ****


		//@ToDo 4. Сообщение для синхронного ответа

		mess += " Получен запрос на проверку группы участников конкуррентной процедуры с идентификатором " +
				concurrentProcedureConclusionRequestAsyncJAXBElement.getValue().getConcurrentProcedure()
																	.getProcedureNumber();
		mess += " Запрос " +
				concurrentProcedureConclusionRequestAsyncJAXBElement.getValue().getHeader().getRequestid() + " от " +
				concurrentProcedureConclusionRequestAsyncJAXBElement.getValue().getHeader().getRequestdate();
		syncResponse.setResultMessage(mess);

		//@ToDo  5. Обновление записи по результатам валидации задачи
		handlerStatus.setResponseSync(syncResponse);

//		writeRequestDataInfoToDb(messageContext);
		return objectFactory.createConcurrentProcedureConclusionRequestAsyncResponse(handlerStatus);
	}
}
