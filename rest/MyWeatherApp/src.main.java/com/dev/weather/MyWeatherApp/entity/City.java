package com.dev.weather.MyWeatherApp.entity;

//import javax.persistence.Entity;
//import javax.persistence.Id;


public class City {
	
	private String id ;
	private String Name;
public City( String name) {
		super();
		
		Name = name;
	}
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}



}
