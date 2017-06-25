package egenproj.WeatherApp.Repository;

import org.springframework.data.repository.Repository;

import egenproj.WeatherApp.Entity.Weather;

public interface WeatherRepository extends Repository<Weather, String>{
	
	public Weather save(Weather weather);
	//public void update(Weather weather);
	
}
