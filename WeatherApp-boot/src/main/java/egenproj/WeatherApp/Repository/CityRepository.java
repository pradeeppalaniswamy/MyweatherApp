package egenproj.WeatherApp.Repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import egenproj.WeatherApp.Entity.City;
import egenproj.WeatherApp.Entity.Weather;



public interface CityRepository  extends Repository<City, String>{
	public List<City> findAll();
	public City save(City city);
	//public void save(City city);

}
