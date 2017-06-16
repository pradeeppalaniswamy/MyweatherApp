package Egenproj.WeatherApp.Repository;

import Egenproj.WeatherApp.Entity.Weather;

public interface WeatherRepository {
	public Weather getCitysWeather(String Cityname);

	public void getCitysWeatherParameter();

	


	public Weather getHourlyWeather();
	

	public Weather getdailywather();
	

	public Weather addWeatherreading ()
;
	
}
