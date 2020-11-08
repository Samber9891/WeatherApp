package com.tts.weatherapp.models;


public class Request {
    
    private String zipCode;

    public Request() {

    }

    public ZipCodeDisplay getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Request [zipCode=" + zipCode + "]";
    }

    
}
