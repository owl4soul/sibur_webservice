package ru.spi2.sibur_webservice.endpoints;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.spi2.jaxws.datatypes.CISTask;
import ru.spi2.jaxws.datatypes.ConcurrentProcedure;
import ru.spi2.jaxws.datatypes.Contract;
import ru.spi2.jaxws.datatypes.CounterPartyControlServiceImpl;
import ru.spi2.jaxws.datatypes.Counterparty;
import ru.spi2.jaxws.datatypes.CounterpartySapIdentities;
import ru.spi2.jaxws.datatypes.Header;
import ru.spi2.jaxws.datatypes.PutContractStatus;
import ru.spi2.jaxws.datatypes.PutContractStatusResponse;
import ru.spi2.jaxws.datatypes.SyncResponse;

import javax.xml.bind.JAXBElement;
import java.util.List;

@Endpoint
public class CounterPartyControlServiceImplImpl  {


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
        System.out.println("");
        System.out.println("asasas");
        return null;
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
