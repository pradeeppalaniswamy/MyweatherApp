package Egenproj.WeatherApp.Service;

import Egenproj.WeatherApp.Entity.Weather;

public interface WeatherService {
	public Weather getCitysWeather(String Cityname);

	public void getCitysWeatherParameter();

	

;
	public Weather getHourlyWeather();
	public void update(Weather weather);

	public Weather getdailywather();
	public Weather saveWeather(Weather weather);
	

	public Weather addWeatherreading ()
;
}
