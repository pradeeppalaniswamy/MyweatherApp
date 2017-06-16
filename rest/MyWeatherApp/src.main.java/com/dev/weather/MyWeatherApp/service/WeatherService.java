package com.dev.weather.MyWeatherApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;

@Service
public interface WeatherService {
	public Weather getCitysWeather();

	public void getCitysWeatherParameter();

	

;
	public Weather getHourlyWeather();
	

	public Weather getdailywather();
	

	public Weather addWeatherreading ()
;
	
}
