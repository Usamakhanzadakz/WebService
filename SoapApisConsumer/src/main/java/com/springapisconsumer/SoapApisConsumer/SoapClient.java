package com.springapisconsumer.SoapApisConsumer;

import jakarta.xml.ws.WebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;
    public GetEmplooyesByIdResponse getEmplooyesByIdResponse(GetEmplooyesByIdRequest request){
        template= new WebServiceTemplate(marshaller);

        GetEmplooyesByIdResponse request1=(GetEmplooyesByIdResponse)
                template.marshalSendAndReceive("http://localhost:8080/ws",request);
        System.out.println(request1.getEmplooy().getEmplooyesName()+"helloo"+request1.getEmplooy().getEmplooyesId());
        return request1;
    }
}
