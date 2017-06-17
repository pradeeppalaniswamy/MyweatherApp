package Egenproj.WeatherApp.Repository;

import java.util.List;

import Egenproj.WeatherApp.Entity.City;



public interface CityRepository {
	public List<City> findallCity();
	public City savecity(City city);
	public void update(City city);

}
