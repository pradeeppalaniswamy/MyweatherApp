package weather.MyWeatherApp.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.weather.MyWeatherApp.entity.City;
import com.dev.weather.MyWeatherApp.entity.Weather;
import com.dev.weather.MyWeatherApp.facade.CityWeatherFacade;
import com.dev.weather.MyWeatherApp.service.CityService;
import com.dev.weather.MyWeatherApp.service.WeatherService;
@Service
public class Facadeimpl implements CityWeatherFacade {
@Autowired
	private WeatherService weatherservice;
@Autowired
private CityService cityservice;

	public Facadeimpl(WeatherService weatherservice, CityService cityservice) {
	super();
	this.weatherservice = weatherservice;
	this.cityservice = cityservice;
}

	@Override
	public Weather getCitysWeather() {
		// TODO Auto-generated method stub
		return weatherservice.getdailywather();
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub
		weatherservice.getCitysWeatherParameter();
	}

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		return cityservice.findallCity();
	}

	@Override
	public Weather getHourlyWeather() {
		// TODO Auto-generated method stub
		return weatherservice.getHourlyWeather();
	}

	@Override
	public Weather getdailywather() {
		// TODO Auto-generated method stub
		return weatherservice.getdailywather();
	}

	@Override
	public Weather addWeatherreading() {
		// TODO Auto-generated method stub
		return weatherservice.addWeatherreading();
	}

}
