package com.example.weatherdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.weatherdata.entity.Weather;
import com.example.weatherdata.entity.Wind;
import com.example.weatherdata.entity.response.ResponseEntityWeather;
import com.example.weatherdata.repository.WeatherRepository;
import com.example.weatherdata.service.WeatherForecastService;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService{

	
	private WeatherRepository weatherRepository;

	@Override
	public Weather getWeatherDetails() {
		
		List<ResponseEntityWeather> weatherDetailsall = weatherRepository.findAll();
		for(ResponseEntityWeather rsp : weatherDetailsall ) {
			
			return rsp.getWeather();
		}
		
		
	}

	@Override
	public Wind getWindDetails() {
		List<ResponseEntityWeather> weatherDetailsall = weatherRepository.findAll();
		for(ResponseEntityWeather rsp : weatherDetailsall ) {
			
			return rsp.getWind();
		}
	}

	@Override
	public int getPressure() {
		// TODO Auto-generated method stub
		List<ResponseEntityWeather> weatherDetailsall = weatherRepository.findAll();
		for(ResponseEntityWeather rsp : weatherDetailsall ) {
			
			return rsp.getPressure();
		}
	}
	
	

}
