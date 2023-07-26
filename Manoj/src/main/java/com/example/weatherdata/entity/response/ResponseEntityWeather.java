package com.example.weatherdata.entity.response;

import java.io.Serializable;

import com.example.weatherdata.entity.Weather;
import com.example.weatherdata.entity.Wind;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntityWeather implements Serializable{
	
	private Weather weather;
	private Wind wind;
	private int pressure;
	
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	

}
