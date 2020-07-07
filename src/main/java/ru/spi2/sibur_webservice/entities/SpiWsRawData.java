package ru.spi2.sibur_webservice.entities;

import ru.spi2.sibur_webservice.constants.ResultCodesEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "SPI_WS_RAW_DATA")
//@Table(name = "SPI_WS_RAW_DATA", schema = "SPI_SIBUR_APVKA")
public class SpiWsRawData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ", allocationSize = 1)
	@Column(name = "ID")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "SEVICE_METHOD_NAME")
	private ServiceMethod seviceMethodName;

	@Lob
	@Column(name = "XML_BODY")
	private String xmlBody;

	@Enumerated(EnumType.STRING)
	@Column(name = "PROCESSING_STATUS")
	private ProcessingStatus processingStatus;

	@Temporal(TemporalType.DATE)
	@Column(name = "STATUS_CHANGED_DATE")
	private Date statusChangedDate;

	@Lob
	@Column(name = "REQUEST_MESSAGE")
	private String requestMessage;

	@Enumerated(EnumType.STRING)
	@Column(name = "SYNC_REQUEST_RESULT")
	private ResultCodesEnum syncRequestResult;

	public SpiWsRawData() {
	}

	public SpiWsRawData(Date createDate, ServiceMethod seviceMethodName, String xmlBody, ProcessingStatus processingStatus, Date statusChangedDate, String requestMessage, ResultCodesEnum syncRequestResult) {
		this.createDate = createDate;
		this.seviceMethodName = seviceMethodName;
		this.xmlBody = xmlBody;
		this.processingStatus = processingStatus;
		this.statusChangedDate = statusChangedDate;
		this.requestMessage = requestMessage;
		this.syncRequestResult = syncRequestResult;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public ServiceMethod getSeviceMethodName() {
		return seviceMethodName;
	}

	public void setSeviceMethodName(ServiceMethod seviceMethodName) {
		this.seviceMethodName = seviceMethodName;
	}

	public String getXmlBody() {
		return xmlBody;
	}

	public void setXmlBody(String xmlBody) {
		this.xmlBody = xmlBody;
	}

	public ProcessingStatus getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus processingStatus) {
		this.processingStatus = processingStatus;
	}

	public Date getStatusChangedDate() {
		return statusChangedDate;
	}

	public void setStatusChangedDate(Date statusChangedDate) {
		this.statusChangedDate = statusChangedDate;
	}


	public Long getId() {
		return id;
	}

	public String getRequestMessage() {
		return requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

	public ResultCodesEnum getSyncRequestResult() {
		return syncRequestResult;
	}

	public void setSyncRequestResult(ResultCodesEnum syncRequestResult) {
		this.syncRequestResult = syncRequestResult;
	}

	/**
	 * Возможные статусы состояния обработки данных запросов
	 */
	public enum ProcessingStatus {
		INSERTED, PROCESSING, PROCESSED, FAILED
	}

	/**
	 * Перечисление всех методов Sibur_apvka.
	 */
	public enum ServiceMethod {
		putHistoricalContracts,
		contractConclusionRequestAsync,
		putContractStatus,
		checkAndSaveRegistrCounterpartySRM_Async,
		putCounterpartyInfo,
		concurrentProcedureConclusionRequestAsync;
	}
}

