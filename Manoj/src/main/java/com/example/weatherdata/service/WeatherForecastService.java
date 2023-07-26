package com.example.weatherdata.service;

import java.util.List;

import com.example.weatherdata.entity.Weather;
import com.example.weatherdata.entity.Wind;
import com.example.weatherdata.entity.response.ResponseEntityWeather;

public interface WeatherForecastService {
	
	Weather getWeatherDetails();
	Wind getWindDetails();
	int getPressure();
}
