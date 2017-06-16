package Egenproj.WeatherApp.Facade;

import java.util.List;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;



public interface CityWeatherFacade {
public String Getval();


public Weather getCitysWeather();

public void getCitysWeatherParameter();



public List<City> findallCity();
;
public Weather getHourlyWeather();


public Weather getdailywather();


public Weather addWeatherreading ();
}
