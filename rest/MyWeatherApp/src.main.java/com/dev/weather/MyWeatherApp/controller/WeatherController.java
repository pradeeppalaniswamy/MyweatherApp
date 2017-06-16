package com.dev.weather.MyWeatherApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;
import com.dev.weather.MyWeatherApp.facade.CityWeatherFacade;
@RequestMapping(value = "Weather")
@RestController

public class WeatherController {
	@Autowired
	private CityWeatherFacade cityweatherfacade;
	
	
	
	public WeatherController(CityWeatherFacade cityweatherfacade) {
		super();
		this.cityweatherfacade = cityweatherfacade;
	}
	@RequestMapping(method = RequestMethod.GET)
	public Weather getCitysWeather()
	{
		return cityweatherfacade.getCitysWeather();
		
	}
	@RequestMapping(method = RequestMethod.GET, value={})
	public void getCitysWeatherParameter()
	{
		
		cityweatherfacade.getCitysWeatherParameter();
	}

	@RequestMapping(method = RequestMethod.GET)
	public Weather getHourlyWeather()
	{
		return cityweatherfacade.getHourlyWeather();
	}
	@RequestMapping(method = RequestMethod.GET)
	public Weather getdailywather()
	{
		return cityweatherfacade.getdailywather();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Weather addWeatherreading ()
	{
		return cityweatherfacade.addWeatherreading();
		
	}
	
	

}
