package Egenproj.WeatherApp.Facade;

import java.util.List;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;



public interface CityWeatherFacade {


public Weather addWeatherReading(Weather weather);

Weather getHourlyWeather(String cityname, String dayorhour);

String[] getCitysWeatherAttribute(String cityname, String attribute);

Weather getCitysWeather(String cityname);


//public Weather addWeatherreading ();
}
