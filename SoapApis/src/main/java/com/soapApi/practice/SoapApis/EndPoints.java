package com.soapApi.practice.SoapApis;


import com.cloudasset.intern.soapws.countries.AddEmplooyesRequest;
import com.cloudasset.intern.soapws.countries.AddEmplooyesResponse;
import com.cloudasset.intern.soapws.countries.ServiceStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndPoints {
    private static final String NAMESPACE_URI = "http://www.cloudasset.com/intern/soapws/countries";
    @Autowired
    EmploysRepo employService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddEmplooyesRequest")
    @ResponsePayload
    public AddEmplooyesResponse addEmplooyesResponse(@RequestPayload AddEmplooyesRequest addEmplooyesRequest)
    {
        AddEmplooyesResponse response=new AddEmplooyesResponse();
        ServiceStatus serviceStatus=new ServiceStatus();

        Emplooy emplooy=new Emplooy();
        BeanUtils.copyProperties(addEmplooyesRequest.getEmplooyInfo(), emplooy);
        employService.addEmploy(emplooy);
        serviceStatus.setStatus("SUCCES");
        serviceStatus.setMessage("Content add succesfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }
}
