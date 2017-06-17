package Egenproj.WeatherApp.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Weather {
	
	
	@Id
	private String id;
	private String humidity;
	private String preassure;
	private String temperature;
	private String city;
	@OneToOne
private Wind wind;
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
	

	public String getTimeoftemp() {
		return timeoftemp;
	}
	public void setTimeoftemp(String timeoftemp) {
		this.timeoftemp = timeoftemp;
	}
	@Override
	public String toString() {
		return "Weather [id=" + id + ", humidity=" + humidity + ", preassure=" + preassure + ", temperature="
				+ temperature + ", city=" + city + ", wind=" + wind + ", description=" + description + ", timeoftemp="
				+ timeoftemp + "]";
	}

	
	
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}
	
}
