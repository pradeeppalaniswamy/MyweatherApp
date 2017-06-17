package Egenproj.WeatherApp.Facade;

import java.util.List;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;



public interface CityWeatherFacade {
public String Getval();


public Weather getCitysWeather(String cityname);

public void getCitysWeatherParameter();

public Weather addWeatherReading(Weather weather);


public List<City> findallCity();
;
public Weather getHourlyWeather();


public Weather getdailywather();

public String[] getCitysWeatherAttribute(String cityname,String attribute);
//public Weather addWeatherreading ();
}
