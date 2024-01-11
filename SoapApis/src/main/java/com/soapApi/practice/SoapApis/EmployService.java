package com.soapApi.practice.SoapApis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

    @Autowired
    EmploysRepo employsRepo;

    public Emplooy findByname(String name){
        return  employsRepo.getEmplooyByName(name);
    }
    public String addEmpl(Emplooy emplooy){
        return employsRepo.addEmploy(emplooy);
    }
}
