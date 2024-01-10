package com.springbootsoap.endpoints;

import com.springbootsoap.Model.Emplooy;
import com.springbootsoap.service.EmployService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import springbootsoap.com.AddEmplooyesRequest;
import springbootsoap.com.AddEmplooyesResponse;
import springbootsoap.com.ServiceStatus;

@Endpoint
public class EmployEndPoints {
    private static final String NAMESPACE_URL="http://com.springbootsoap.allapis";
    @Autowired
    EmployService employService;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "AddEmplooyesRequest")
    @ResponsePayload
    public AddEmplooyesResponse addEmplooyesResponse(@RequestPayload AddEmplooyesRequest addEmplooyesRequest)
    {
        AddEmplooyesResponse response=new AddEmplooyesResponse();
        ServiceStatus serviceStatus=new ServiceStatus();

        Emplooy emplooy=new Emplooy();
        BeanUtils.copyProperties(addEmplooyesRequest.getEmplooyInfo(), emplooy);
        employService.addEmpl(emplooy);
        serviceStatus.setStatus("SUCCES");
        serviceStatus.setMessage("Content add succesfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }

   


}
