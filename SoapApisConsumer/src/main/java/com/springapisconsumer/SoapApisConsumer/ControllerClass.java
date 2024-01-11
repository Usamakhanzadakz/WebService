package com.springapisconsumer.SoapApisConsumer;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerClass {
    @Autowired
    SoapClient soapClient;
    @PostMapping("/CreateAccount/{name}")
    public ResponseEntity<String> createAccount(@PathVariable("name")String name) {
        try {
            GetEmplooyesByIdRequest request=new GetEmplooyesByIdRequest();
            request.setName(name);
            GetEmplooyesByIdResponse emplooyes=soapClient.getEmplooyesByIdResponse(request);
            return ResponseEntity.status(HttpStatus.OK).body(emplooyes.getEmplooy().getEmplooyesName()+""+emplooyes.getEmplooy().getEmplooyesId());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
