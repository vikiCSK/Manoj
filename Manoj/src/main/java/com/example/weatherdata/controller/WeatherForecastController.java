package com.example.weatherdata.controller;

import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.weatherdata.entity.Weather;
import com.example.weatherdata.entity.Wind;
import com.example.weatherdata.entity.response.ResponseEntityWeather;
import com.example.weatherdata.service.WeatherForecastService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class WeatherForecastController {

	private WeatherForecastService service;

	@GetMapping("/{userInput}")
	    public ResponseEntity<ResponseEntityWeather> getWeatherForecastZipcode(@PathVariable String userInput) {

	    	if(userInput.equals("1")) {
	        return new ResponseEntity<ResponseEntityWeather>(service.getWeatherDetails(),HttpStatus.ACCEPTED);
	    	}
	    	else if(userInput.equals("2")){
	    		return new ResponseEntity<Wind>(service.getWindDetails(),HttpStatus.ACCEPTED);
	    	}
	    	else if(userInput.equals("3")){
	    		return new ResponseEntity<int>(service.getPressure(),HttpStatus.ACCEPTED);
	    	}
	    	else if(userInput.equals("0")){
	    	
	    		SpringApplication.exit(ApplicationContext, ()->0);
	    		
	    	}
	    }

}
