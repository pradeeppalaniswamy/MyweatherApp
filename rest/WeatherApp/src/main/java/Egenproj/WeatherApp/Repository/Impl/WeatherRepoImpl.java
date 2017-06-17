package Egenproj.WeatherApp.Repository.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Repository.WeatherRepository;
@Repository
public class WeatherRepoImpl implements WeatherRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public Weather getCitysWeather(String Cityname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Weather getHourlyWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getdailywather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather addWeatherreading() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather saveWeather(Weather weather) {
		// TODO Auto-generated method stub
		 em.persist(weather);
		 return weather;
	}
	

}
