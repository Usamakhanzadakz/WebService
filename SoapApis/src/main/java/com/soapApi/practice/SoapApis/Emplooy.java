package com.soapApi.practice.SoapApis;

public class Emplooy {
    private long id;
    private String name;
    private long sallery;

    public Emplooy(long id, String name, long sallery) {
        this.id = id;
        this.name = name;
        this.sallery = sallery;
    }

    public Emplooy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSallery() {
        return sallery;
    }

    public void setSallery(long sallery) {
        this.sallery = sallery;
    }
}
