package Egenproj.WeatherApp.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.WeatherService;
import Egenproj.WeatherApp.Entity.Weather;
@RestController
@RequestMapping(value="/weather")
public class WeatherController {

	
	private CityWeatherFacade cityweatherfacade;
	private WeatherService weatherservice;
	public WeatherController(CityWeatherFacade cityweatherfacade, WeatherService weatherservice) {
	
		this.cityweatherfacade = cityweatherfacade;
		this.weatherservice = weatherservice;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Weather getCitysWeather(@PathVariable("city") String Cityname)
	{
		return weatherservice.getCitysWeather(Cityname);
		
	}
	
@RequestMapping(method = RequestMethod.POST)
	public Weather getCitysWeatherParameter(@RequestBody Weather weather)
	{
		
		return cityweatherfacade.addWeatherReading(weather);
	}

/*
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
	*/
	
}
