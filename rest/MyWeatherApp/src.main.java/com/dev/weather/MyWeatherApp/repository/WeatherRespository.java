package com.dev.weather.MyWeatherApp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;


public interface WeatherRespository {
	public Weather getCitysWeather();

	public void getCitysWeatherParameter();

	


	public Weather getHourlyWeather();
	

	public Weather getdailywather();
	

	public Weather addWeatherreading ()
;
	

}
