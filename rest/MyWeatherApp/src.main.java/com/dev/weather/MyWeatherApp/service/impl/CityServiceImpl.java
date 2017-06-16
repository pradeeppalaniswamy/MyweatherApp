package com.dev.weather.MyWeatherApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.repository.CityRepository;
import com.dev.weather.MyWeatherApp.service.CityService;

public class CityServiceImpl implements CityService {
	@Autowired
private CityRepository cityrepository;

	public CityServiceImpl(CityRepository cityrepository) {
	super();
	this.cityrepository = cityrepository;
}

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		return cityrepository.findallCity();
	}

}
