package com.dev.weather.MyWeatherApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.facade.CityWeatherFacade;
@RestController
@RequestMapping(value = "city")

public class CityController {

	@Autowired
	private CityWeatherFacade cityweatherfacade;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<City> findallCity()
	{
		return cityweatherfacade.findallCity();
		
	}
	
	
}
