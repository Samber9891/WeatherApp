package com.tts.weatherapp.repositories;

import java.util.List;

import com.tts.weatherapp.models.ZipCode;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
    
    List<ZipCode>findAllById(); 
}
