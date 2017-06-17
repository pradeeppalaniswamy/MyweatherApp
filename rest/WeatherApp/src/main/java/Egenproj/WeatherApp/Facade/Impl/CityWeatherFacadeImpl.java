package Egenproj.WeatherApp.Facade.Impl;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.CityService;
import Egenproj.WeatherApp.Service.WeatherService;
@Service
public class CityWeatherFacadeImpl implements CityWeatherFacade{
private CityService cityservice;
private WeatherService weatherservice;

	public CityWeatherFacadeImpl(CityService cityservice, WeatherService weatherservice) {
	
	this.cityservice = cityservice;
	this.weatherservice = weatherservice;
}

	@Override
	public String Getval() {
		// TODO Auto-generated method stub
		return "ppgeth pp";
	}

	@Override
	public Weather getCitysWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		return cityservice.findallCity();
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
	public Weather addWeatherReading(Weather weather) {
		/* can use j8*/
		City currcity=cityservice.ifCityExists(weather.getCity());
		weatherservice.saveWeather(weather);
		/*if(currcity==null)
		{
			City newcity=new City();
			newcity.setName(weather.getCity());
			List<Weather> citysweather =new  ArrayList<Weather>();
			citysweather.add(weather);
			newcity.setWeatherreadings(citysweather);
			cityservice.savecity(newcity);
			
		}*//*foreign key */
		if(currcity==null)
		{City newcity =new City();
		System.out.println("printing....");
		newcity.setName(weather.getCity());
			
			cityservice.savecity(newcity);
			
		List<Weather> citysweather =new  ArrayList<Weather>();
			citysweather.add(weather);
			newcity.setWeatherreadings(citysweather);
			System.out.println(newcity.getWeatherreadings().get(0).getCity());
			cityservice.update(newcity);
			return weather;
		}
		System.out.println("cur city not null....");
		System.out.println(currcity.toString());
			List<Weather> weatherreading=currcity.getWeatherreadings();
			
			/*if(weatherreading!=null)
				{
				//System.out.println(weatherreading.size()+"is the size ");
				System.out.println("not empty");
				
				for(Weather e :weatherreading)
				{
					System.out.println(e.toString());
					
				}
				
				}
			else
			{
				System.out.println("empty");
				
			}*/
			/*System.out.println(weatherreading.get(0).getCity()+"   is city");*/
			weatherreading.add(weather);
	currcity.setWeatherreadings(weatherreading);
	//System.out.println(currcity.getWeatherreadings().get(0).getCity()+"   is city");*/
		cityservice.update(currcity);
			
		
		// TODO Auto-generated method stub
		return weather;
	}
	
	
	
	

}
