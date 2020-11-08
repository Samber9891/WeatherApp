package com.tts.weatherapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.tts.weatherapp.models.Request;
import com.tts.weatherapp.models.Response;
import com.tts.weatherapp.models.ZipCode;
import com.tts.weatherapp.service.WeatherService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class WeatherController {

    @Autowired 
   private WeatherService weatherService;

    @GetMapping("/") 
    public String getIndex(Model model) {
    model.addAttribute("request", new Request());  
    return "index";
    }

    @PostMapping("/")
    public String postIndex(Request request, Model model) {

    Response data = weatherService.getForecast(request.getZipCode());
    model.addAttribute("data", data);
    return "index";
    }

    @PostMapping(value="/")
    public String postZipCodes(ZipCode zipcode, Model model) {
        List<Response> zipCodes = new ArrayList<Response>(10); 
        
        return "index";
    }
    
}
