package Egenproj.WeatherApp.Repository;

import Egenproj.WeatherApp.Entity.Weather;

public interface WeatherRepository {
	
	public Weather saveWeather(Weather weather);
	public void update(Weather weather);
	
}
