package Egenproj.WeatherApp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.CityService;
@RestController
@RequestMapping(value="/city")
public class CityController {
	private CityWeatherFacade cityweatherfacade;
	private CityService cityservice;
	

	public CityController(CityWeatherFacade cityweatherfacade, CityService cityservice) {

		this.cityweatherfacade = cityweatherfacade;
		this.cityservice = cityservice;
	}


	@RequestMapping(method=RequestMethod.GET,value="/getpp",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String getvalues()
	{
		return cityweatherfacade.Getval();
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<City> findallCity()
	{
		return cityweatherfacade.findallCity();
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public City savecity(@RequestBody City city)
	{
		return cityservice.savecity(city);
		
	}

}
