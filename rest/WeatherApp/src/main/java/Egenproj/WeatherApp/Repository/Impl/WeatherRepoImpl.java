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
	public Weather saveWeather(Weather weather) {
		// TODO Auto-generated method stub
		 em.persist(weather);
		 return weather;
	}

	@Override
	public void update(Weather weather) {
		// TODO Auto-generated method stub
		em.merge(weather);
		
	}
	

}
