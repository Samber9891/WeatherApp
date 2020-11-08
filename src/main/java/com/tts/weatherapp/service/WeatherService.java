package com.tts.weatherapp.service;

import java.util.ArrayList;
import java.util.List;

import com.tts.weatherapp.models.Request;
import com.tts.weatherapp.models.Response;
import com.tts.weatherapp.models.ZipCode;
import com.tts.weatherapp.models.ZipCodeDisplay;
import com.tts.weatherapp.repositories.ZipCodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService<ZipCode> {

    @Value("${api_key}")
    private String apiKey;

    @Autowired
    ZipCodeRepository zipCodeRepository; 

    // Make a call to openweather api, with dynamic zipcode and apikey
    public Response getForecast(String zipCode){

        String url="http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + "&appid=" + apiKey;
        RestTemplate restTemplate= new RestTemplate(); 
        
        // Make a call to "URL"
        // Shove the response in a response "object"
        
        try{
            return restTemplate.getForObject(url, Response.class);  
        }
        catch (HttpClientErrorException exception) {
            Response response = new Response(); 
            response.setName("ERROR"); 
            return response; 
        }

        public List<ZipCodeDisplay zipCodeList(List<ZipCode> zipCodes) {
           return Request.getZipCode()); 

        }
        
      public List<ZipCodeDisplay> findAll() {
          List<ZipCode> zipCodes = zipCodeRepository.findAllById();
          return zipCodeList(zipCodes); 
      }

        
    }


       



    

    
