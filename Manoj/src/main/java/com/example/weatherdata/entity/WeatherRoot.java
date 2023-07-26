package com.example.weatherdata.entity;

import java.util.List;

public class WeatherRoot {
	
	private int message;
    private int cnt;
    private List<WeatherRoot> list;
    private City city;
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<WeatherRoot> getList() {
		return list;
	}
	public void setList(List<WeatherRoot> list) {
		this.list = list;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
    
    
    
    

}
