package Egenproj.WeatherApp.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Repository.CityRepository;
import Egenproj.WeatherApp.Service.CityService;
@Service
public class CityServiceImpl implements CityService {
private CityRepository cityrepository;

public CityServiceImpl(CityRepository cityrepository) {

	this.cityrepository = cityrepository;
}

@Override
public List<City> findallCity() {
	// TODO Auto-generated method stub
	return cityrepository.findallCity();
}
}
