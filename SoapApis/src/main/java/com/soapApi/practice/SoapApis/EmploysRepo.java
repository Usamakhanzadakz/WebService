package com.soapApi.practice.SoapApis;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmploysRepo {
    ArrayList<Emplooy> emplooys=new ArrayList<Emplooy>();
    Emplooy emplooy1=new Emplooy(1,"Usama2",212212);
    Emplooy emplooy2=new Emplooy(2,"jameel",212212);
    Emplooy emplooy3=new Emplooy(3,"anis",212212);

    public EmploysRepo() {
        emplooys.add(emplooy1);
        emplooys.add(emplooy2);
        emplooys.add(emplooy3);
    }
    public Emplooy getEmplooyByid(int id){
       return emplooys.get(id-1);
    }

    public Emplooy getEmplooyByName(String name) {
        for (Emplooy emplooy : emplooys) {
            if (emplooy.getName().equals(name)) {
                return emplooy;
            }
        }
        return null;
    }
    public String addEmploy(Emplooy emplooy){
        emplooys.add(emplooy);
        return "Success";
    }
}

