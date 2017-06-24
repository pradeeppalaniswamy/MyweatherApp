package com.dev.weather.MyWeatherApp.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.repository.CityRepository;

public class CityRepoimpl implements CityRepository {

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		
		List<City> citylist =new ArrayList<City>();
		citylist.add(new City("kingsville"));
		
		return citylist;
	}

}
