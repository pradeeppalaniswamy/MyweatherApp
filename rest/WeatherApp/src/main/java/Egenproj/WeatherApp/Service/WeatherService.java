package Egenproj.WeatherApp.Service;

import Egenproj.WeatherApp.Entity.Weather;

public interface WeatherService {
	
	public void update(Weather weather);


	public Weather saveWeather(Weather weather);
	

}
