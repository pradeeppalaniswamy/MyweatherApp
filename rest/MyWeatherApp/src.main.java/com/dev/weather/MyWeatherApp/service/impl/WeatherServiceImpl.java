package com.dev.weather.MyWeatherApp.service.impl;

import java.util.List;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;
import com.dev.weather.MyWeatherApp.repository.WeatherRespository;
import com.dev.weather.MyWeatherApp.service.WeatherService;

public class WeatherServiceImpl implements WeatherService {
private WeatherRespository watherrepository;
	@Override
	public Weather getCitysWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	public WeatherServiceImpl(WeatherRespository watherrepository) {
		super();
		this.watherrepository = watherrepository;
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub

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
