package egenproj.WeatherApp.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import egenproj.WeatherApp.Controller.Constants.Mapper;
import egenproj.WeatherApp.Entity.Weather;
import egenproj.WeatherApp.Facade.CityWeatherFacade;
import egenproj.WeatherApp.Service.WeatherService;
@RestController
@RequestMapping(value=Mapper.WEATHER)
public class WeatherController {

	
	private CityWeatherFacade cityweatherfacade;
	private WeatherService weatherservice;
	public WeatherController(CityWeatherFacade cityweatherfacade, WeatherService weatherservice) {
	
		this.cityweatherfacade = cityweatherfacade;
		this.weatherservice = weatherservice;
	}
	
	@RequestMapping(method = RequestMethod.GET,value="{city}")
	public Weather getCitysWeather(@PathVariable("city") String Cityname)
	{
		return cityweatherfacade.getCitysWeather(Cityname);
		
	}
	@RequestMapping(method = RequestMethod.GET,value="{city}/{attribute}")
	public String[] getCitysWeatherAttribute(@PathVariable("city") String Cityname,@PathVariable("attribute") String attribute)
	{
		return cityweatherfacade.getCitysWeatherAttribute(Cityname,attribute);
		
	}
@RequestMapping(method = RequestMethod.POST)
	public Weather getCitysWeatherParameter(@RequestBody Weather weather)
	{
		
		return cityweatherfacade.addWeatherReading(weather);
	}


	@RequestMapping(method = RequestMethod.GET,value="getavg/{city}/{dayorhr}")
	public Weather getHourlyWeather(@PathVariable("city") String cityname,@PathVariable("dayorhr") String dayorhour )
	{
		return cityweatherfacade.getHourlyWeather(cityname,dayorhour);
	}
	
	
}
