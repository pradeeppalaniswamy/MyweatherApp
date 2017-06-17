package Egenproj.WeatherApp.Service;

import java.util.List;

import Egenproj.WeatherApp.Entity.City;



public interface CityService {
	public List<City> findallCity();
	public City savecity(City city);
	public City ifCityExists(String cityname);
	public void update(City city);
}
