package com.springbootsoap.service;

import com.springbootsoap.Model.Emplooy;
import com.springbootsoap.repo.EmploysRepo;
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
