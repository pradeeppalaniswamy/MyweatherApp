package com.dev.weather.MyWeatherApp.facade;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;


public interface CityWeatherFacade {

	public Weather getCitysWeather();

	public void getCitysWeatherParameter();

	

	public List<City> findallCity();
;
	public Weather getHourlyWeather();
	

	public Weather getdailywather();
	

	public Weather addWeatherreading ()
;
	

}
