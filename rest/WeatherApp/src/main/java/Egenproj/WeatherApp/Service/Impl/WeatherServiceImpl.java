package Egenproj.WeatherApp.Service.Impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Repository.WeatherRepository;
import Egenproj.WeatherApp.Service.WeatherService;
@Service
public class WeatherServiceImpl implements  WeatherService{

	private WeatherRepository weatherrepository;

	public WeatherServiceImpl(WeatherRepository weatherrepository) {
	
		this.weatherrepository = weatherrepository;
	}


	
@Transactional
	@Override
	public Weather saveWeather(Weather weather) {
		// TODO Auto-generated method stub
		return weatherrepository.saveWeather(weather);
	}
@Transactional
@Override
public void update(Weather weather) {
	// TODO Auto-generated method stub
	weatherrepository.update(weather);
	
}
	
}
