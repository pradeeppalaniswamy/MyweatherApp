package Egenproj.WeatherApp.Facade.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.CityService;
import Egenproj.WeatherApp.Service.WeatherService;
@Service
public class CityWeatherFacadeImpl implements CityWeatherFacade{
private CityService cityservice;
private WeatherService weatherservice;

	public CityWeatherFacadeImpl(CityService cityservice, WeatherService weatherservice) {
	
	this.cityservice = cityservice;
	this.weatherservice = weatherservice;
}

	@Override
	public String Getval() {
		// TODO Auto-generated method stub
		return "ppgeth pp";
	}

	@Override
	public Weather getCitysWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		return cityservice.findallCity();
	}

	@Override
	public Weather getHourlyWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getdailywather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather addWeatherreading() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
