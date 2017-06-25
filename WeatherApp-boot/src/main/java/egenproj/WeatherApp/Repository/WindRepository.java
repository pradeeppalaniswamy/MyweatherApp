package egenproj.WeatherApp.Repository;

import org.springframework.data.repository.Repository;

import egenproj.WeatherApp.Entity.Weather;
import egenproj.WeatherApp.Entity.Wind;

public interface WindRepository  extends Repository<Wind, String> {
	public Wind save(Wind wind);
}
