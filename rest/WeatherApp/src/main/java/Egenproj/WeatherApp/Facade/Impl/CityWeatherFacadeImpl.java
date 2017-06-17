package Egenproj.WeatherApp.Facade.Impl;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Entity.Wind;
import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.CityService;
import Egenproj.WeatherApp.Service.WeatherService;
import Egenproj.WeatherApp.Service.WindService;
@Service
public class CityWeatherFacadeImpl implements CityWeatherFacade{
private CityService cityservice;
private WeatherService weatherservice;
private WindService windservice;


	public CityWeatherFacadeImpl(CityService cityservice, WeatherService weatherservice, WindService windservice) {
		super();
		this.cityservice = cityservice;
		this.weatherservice = weatherservice;
		this.windservice = windservice;
	}

	@Override
	public String Getval() {
		// TODO Auto-generated method stub
		return "ppgeth pp";
	}

	@Override
	public Weather getCitysWeather(String cityname) {
		// TODO Auto-generated method stub
		City currcity=cityservice.ifCityExists(cityname);
		if(currcity!=null){
			System.out.println("cityfound");
		List<Weather> citysweatherlist =currcity.getWeatherreadings();
		Weather latestweather=findlatest(citysweatherlist);
		return latestweather;
		}
		System.out.println("city not found");
		return new Weather();
	}
	
	public Weather findlatest(List<Weather> weatherlist)
	{System.out.println(weatherlist.get(0).toString()+" weather to be returned");
		return weatherlist.get(0);
		
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
		Wind wind=weather.getWind();
		if(wind!=null){
			System.out.println("wind not null");
		windservice.saveWind(wind);
			System.out.println(wind.toString()+"is wind");
		
		weather.setWind(wind);
		weatherservice.saveWeather(weather);
		}
		
		
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

	@Override
	public String[] getCitysWeatherAttribute(String cityname, String attribute) {
		// TODO Auto-generated method stub
		String[] retattribute=new String[2];
		retattribute[0]=cityname+"s "+attribute+"  value";
		Weather citysweather=getCitysWeather( cityname);
		if(citysweather!=null)
		{
		if(attribute.equalsIgnoreCase("wind"))
		{
			retattribute[1]=	citysweather.getWind().toString();
		}
		else if(attribute.equalsIgnoreCase("description"))
		{
			
		}
		else if(attribute.equalsIgnoreCase("humidity"))
		{
			retattribute[1]=	citysweather.getHumidity();
		}
		else if(attribute.equalsIgnoreCase("preassure"))
		{
			retattribute[1]=	citysweather.getPreassure();
		}
		else if(attribute.equalsIgnoreCase("temperature"))
		{
			retattribute[1]=	citysweather.getTemperature();
		}
		else if(attribute.equalsIgnoreCase("speed"))
		{
			retattribute[1]=	citysweather.getWind().getSpeed();
		}
		else if(attribute.equalsIgnoreCase("degree"))
		{
			retattribute[1]=	citysweather.getWind().getDegree();
		}
		else if(attribute.equalsIgnoreCase("timestamp"))
		{
			retattribute[1]=	citysweather.getTimeoftemp();
		}
		else 
		{
			retattribute[1]="invalid ";
		}
		return retattribute;
		
		}
		retattribute[1]="not found";
		return retattribute;
	}
	
	
	
	

}
