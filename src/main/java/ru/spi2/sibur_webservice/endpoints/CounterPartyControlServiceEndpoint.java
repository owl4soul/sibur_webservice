package ru.spi2.sibur_webservice.endpoints;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.spi2.jaxws.datatypes.CISTask;
import ru.spi2.jaxws.datatypes.ConcurrentProcedure;
import ru.spi2.jaxws.datatypes.Contract;
import ru.spi2.jaxws.datatypes.Counterparty;
import ru.spi2.jaxws.datatypes.CounterpartySapIdentities;
import ru.spi2.jaxws.datatypes.Header;
import ru.spi2.jaxws.datatypes.PutContractStatus;
import ru.spi2.jaxws.datatypes.PutContractStatusResponse;
import ru.spi2.jaxws.datatypes.SyncResponse;
import ru.spi2.sibur_webservice.entities.BankDetailEntity;
import ru.spi2.sibur_webservice.entities.ContractEntity;
import ru.spi2.sibur_webservice.repositories.BankDetailEntityRepository;
import ru.spi2.sibur_webservice.repositories.ContractEntityRepository;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.List;

@Endpoint
public class CounterPartyControlServiceEndpoint {

    @Resource
    private BankDetailEntityRepository bankDetailEntityRepository;

    @Resource
    private ContractEntityRepository contractEntityRepository;


    public SyncResponse checkAndSaveRegistrCounterpartySRMAsync(Header header, String registrreqGuid, Counterparty counterparty) {
        return null;
    }


    public SyncResponse concurrentProcedureConclusionRequestAsync(Header header, ConcurrentProcedure concurrentProcedure) {
        return null;
    }


    @PayloadRoot(localPart = "PutContractStatus", namespace = "http://spi2.ru/jaxws/datatypes")
    @ResponsePayload
    //   public PutContractStatusResponse putContractStatus(@RequestPayload HeaderEntity headerEntity, @RequestPayload String contractId , @RequestPayload String approvalStage) {
    public JAXBElement<PutContractStatusResponse> putContractStatus(@RequestPayload JAXBElement<PutContractStatus> putContractStatusJAXBElement
            , MessageContext messageContext) {

        ContractEntity contractEntity = new ContractEntity();
        contractEntity.setApprovalStage("YES");

        contractEntityRepository.save(contractEntity);



        SyncResponse syncResponse = new SyncResponse();
        syncResponse.setResultCode("111");
        syncResponse.setResultMessage("Reise");

        PutContractStatusResponse putContractStatusResponse = new PutContractStatusResponse();
        putContractStatusResponse.setResponseSync(syncResponse);

        QName qName = new QName("http://spi2.ru/jaxws/datatypes", "PutContractResponse");
        JAXBElement<PutContractStatusResponse> jaxbElement = new JAXBElement<PutContractStatusResponse>(qName, PutContractStatusResponse.class, putContractStatusResponse);
        return jaxbElement;
    }


    public SyncResponse putHistoricalContracts(Header header, List<Contract> contracts) {
        return null;
    }


    public SyncResponse contractConclusionRequestAsync(Header header, CISTask cisTask) {
        return null;
    }


    public SyncResponse putCounterpartyInfo(Header header, String registrationRegrequestId, Counterparty counterparty, CounterpartySapIdentities counterpartySapIdentities) {
        return null;
    }
}
