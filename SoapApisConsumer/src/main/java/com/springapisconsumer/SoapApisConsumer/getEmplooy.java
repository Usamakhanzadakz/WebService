package com.springapisconsumer.SoapApisConsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class getEmplooy {

    @Bean
    public  Jaxb2Marshaller getMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.springapisconsumer.SoapApisConsumer");
        return marshaller;
    }
}
