package com.tts.weatherapp.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ZipCodeDisplay {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zipCode_id")
    private Long id;

    private String zipCode;

    public ZipCodeDisplay() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ZipCodeDisplay(Long id, String zipCode) {
        this.id = id;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "ZipCodeDisplay [id=" + id + ", zipCode=" + zipCode + "]";
    }

    

    
}
