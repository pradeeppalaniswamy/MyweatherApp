package Egenproj.WeatherApp.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Weather {
	@Override
	public String toString() {
		return "Weather [id=" + id + ", humidity=" + humidity + ", preassure=" + preassure + ", temperature="
				+ temperature + ", Wind=" + Wind + ", city=" + city + ", speed=" + speed + ", description="
				+ description + ", timeoftemp=" + timeoftemp + "]";
	}
	@Id
	private String id;
	private String humidity;
	private String preassure;
	private String temperature;
	private String Wind;
	
	private String city;
	private String speed;
	private String description;
	private String timeoftemp;
	public String getId() {
		return id;
	}

	public Weather() {
		this.id=UUID.randomUUID().toString();
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getPreassure() {
		return preassure;
	}
	public void setPreassure(String preassure) {
		this.preassure = preassure;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWind() {
		return Wind;
	}
	public void setWind(String wind) {
		Wind = wind;
	}/*
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}*/
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getTimeoftemp() {
		return timeoftemp;
	}
	public void setTimeoftemp(String timeoftemp) {
		this.timeoftemp = timeoftemp;
	}
	
}
