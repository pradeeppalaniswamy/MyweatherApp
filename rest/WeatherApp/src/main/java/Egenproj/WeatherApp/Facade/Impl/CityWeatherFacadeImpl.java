package Egenproj.WeatherApp.Facade.Impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Entity.Weather;
import Egenproj.WeatherApp.Entity.Wind;
import Egenproj.WeatherApp.Facade.CityWeatherFacade;
import Egenproj.WeatherApp.Service.CityService;
import Egenproj.WeatherApp.Service.WeatherService;
import Egenproj.WeatherApp.Service.WindService;
@Service
public class CityWeatherFacadeImpl implements CityWeatherFacade{
private CityService cityservice;
private WeatherService weatherservice;
private WindService windservice;


	public CityWeatherFacadeImpl(CityService cityservice, WeatherService weatherservice, WindService windservice) {
		super();
		this.cityservice = cityservice;
		this.weatherservice = weatherservice;
		this.windservice = windservice;
	}

	@Override
	public String Getval() {
		// TODO Auto-generated method stub
		return "ppgeth pp";
	}

	@Override
	public Weather getCitysWeather(String cityname) {
		// TODO Auto-generated method stub
		City currcity=cityservice.ifCityExists(cityname);
		if(currcity!=null){
			System.out.println("cityfound");
		List<Weather> citysweatherlist =currcity.getWeatherreadings();
		Weather latestweather=findlatest(citysweatherlist);
		return latestweather;
		}
		System.out.println("city not found");
		return new Weather();
	}
	
	public Weather findlatest(List<Weather> weatherlist)
	{
		List<Weather> w1=sort(weatherlist);
	for(int i=0;i<w1.size();i++)
	{
		
		System.out.println("index  "+i+"   :"+w1.get(i).toString());
	}
		
		return sort(weatherlist).get(weatherlist.size()-1) ;
		
	}

	@Override
	public void getCitysWeatherParameter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		return cityservice.findallCity();
	}

/*	@Override
	public Weather getHourlyWeather() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public Weather getdailywather() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Weather addWeatherReading(Weather weather) {
		/* can use j8*/
		City currcity=cityservice.ifCityExists(weather.getCity());
		Wind wind=weather.getWind();
		if(wind!=null){
			System.out.println("wind not null");
		windservice.saveWind(wind);
			System.out.println(wind.toString()+"is wind");
		
		weather.setWind(wind);
		weatherservice.saveWeather(weather);
		}
		
		
		/*if(currcity==null)
		{
			City newcity=new City();
			newcity.setName(weather.getCity());
			List<Weather> citysweather =new  ArrayList<Weather>();
			citysweather.add(weather);
			newcity.setWeatherreadings(citysweather);
			cityservice.savecity(newcity);
			
		}*//*foreign key */
		if(currcity==null)
		{City newcity =new City();
		System.out.println("printing....");
		newcity.setName(weather.getCity());
			
			cityservice.savecity(newcity);
			
		List<Weather> citysweather =new  ArrayList<Weather>();
			citysweather.add(weather);
			newcity.setWeatherreadings(citysweather);
			System.out.println(newcity.getWeatherreadings().get(0).getCity());
			cityservice.update(newcity);
			return weather;
		}
		System.out.println("cur city not null....");
		System.out.println(currcity.toString());
			List<Weather> weatherreading=currcity.getWeatherreadings();
			
			weatherreading.add(weather);
	currcity.setWeatherreadings(weatherreading);
	//System.out.println(currcity.getWeatherreadings().get(0).getCity()+"   is city");*/
		cityservice.update(currcity);
			
		
		// TODO Auto-generated method stub
		return weather;
	}

	@Override
	public String[] getCitysWeatherAttribute(String cityname, String attribute) {
		// TODO Auto-generated method stub
		String[] retattribute=new String[2];
		retattribute[0]=cityname+"s "+attribute+"  value";
		Weather citysweather=getCitysWeather( cityname);
		if(citysweather!=null)
		{
		if(attribute.equalsIgnoreCase("wind"))
		{
			retattribute[1]=	citysweather.getWind().toString();
		}
		else if(attribute.equalsIgnoreCase("description"))
		{
			
		}
		else if(attribute.equalsIgnoreCase("humidity"))
		{
			retattribute[1]=	citysweather.getHumidity();
		}
		else if(attribute.equalsIgnoreCase("preassure"))
		{
			retattribute[1]=	citysweather.getPreassure();
		}
		else if(attribute.equalsIgnoreCase("temperature"))
		{
			retattribute[1]=	citysweather.getTemperature();
		}
		else if(attribute.equalsIgnoreCase("speed"))
		{
			retattribute[1]=	citysweather.getWind().getSpeed();
		}
		else if(attribute.equalsIgnoreCase("degree"))
		{
			retattribute[1]=	citysweather.getWind().getDegree();
		}
		else if(attribute.equalsIgnoreCase("timestamp"))
		{
			retattribute[1]=	citysweather.getTimeoftemp();
		}
		else 
		{
			retattribute[1]="invalid ";
		}
		return retattribute;
		
		}
		retattribute[1]="not found";
		return retattribute;
	}

	@Override
	public Weather getHourlyWeather(String cityname, String dayorhour) {
		// TODO Auto-generated method stub
		if(!(dayorhour.equalsIgnoreCase("day")||dayorhour.equalsIgnoreCase("hour")))return null;
		
		City currcity=cityservice.ifCityExists(cityname);
		if(currcity!=null)
		{
			
			List<Weather> citysweather=currcity.getWeatherreadings();
			return getAverageWeather( partition(citysweather,dayorhour));
		}
		
		
		return null;
	}
	
	public List<Weather> partition(List<Weather> weatherlist,String dayorhour)
	{   DateFormat format1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS", Locale.ENGLISH);
		Date datetocompare=getDatetocompare(dayorhour);
		List<Weather> collect = weatherlist.stream().filter(w->{
			try {
				return format1.parse(w.getTimeoftemp().replaceAll("[a-z A-Z]", "")).compareTo(datetocompare)>0;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}).collect(Collectors.toList());
		
		return collect;
		
		
	}
	
	public Date getDatetocompare(String dayorhour)
	{
		long ONE_MINUTE_IN_MILLIS=60000;
		if(dayorhour.equalsIgnoreCase("day")){
			Date dateWithoutTime=null;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					 dateWithoutTime = sdf.parse(sdf.format(new Date()));
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return dateWithoutTime;	
			
		}
		else{
		
			int num_of_minitutes_in_hour=60;
			Calendar date = Calendar.getInstance();
			long t= date.getTimeInMillis();
			Date date60minback=new Date(t - (num_of_minitutes_in_hour * ONE_MINUTE_IN_MILLIS));
			return date60minback;
		}	
		
	}
	
	public Weather getAverageWeather(List<Weather> weatherlist)
	{
		Weather avgweather=new Weather();
		if(!weatherlist.isEmpty()){
		avgweather.setCity(weatherlist.get(0).getCity());
		Wind  avgwind=new Wind();
		avgwind.setSpeed(weatherlist.stream().mapToDouble(w->Double.valueOf(w.getWind().getSpeed())).average().toString());
		avgwind.setDegree(weatherlist.stream().mapToDouble(w->Double.valueOf(w.getWind().getDegree())).average().toString());
		avgweather.setWind(avgwind);
		avgweather.setHumidity(weatherlist.stream().mapToDouble(w->Double.valueOf(w.getHumidity())).average().toString());
		avgweather.setPreassure(weatherlist.stream().mapToDouble(w->Double.valueOf(w.getPreassure())).average().toString());
		avgweather.setTemperature(weatherlist.stream().mapToDouble(w->Double.valueOf(w.getTemperature())).average().toString());
		}
		return avgweather;
	}
	
	public List<Weather> sort (List<Weather> weatherlist)
	{
		
	        DateFormat format1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS", Locale.ENGLISH);
	/*	Collections.sort(weatherlist,(a,b)->{
			try {
				return format1.parse(a.getTimeoftemp().replaceAll("[a-z A-Z]", "")).compareTo(format1.parse(b.getTimeoftemp().replaceAll("[a-z A-Z]", "")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		});*/
		List<Weather> collect = weatherlist.stream().sorted(
				(w1,w2)->{
					try {
						return format1.parse(w1.getTimeoftemp().replaceAll("[a-z A-Z]", "")).
						compareTo(format1.parse(w2.getTimeoftemp().replaceAll("[a-z A-Z]", "")));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return 0;
				}
				).collect(Collectors.toList());
						
		
		return collect;
	}
	/***************************************old replaced by java8*************************************************************//*
	
	public List<Weather> partition(List<Weather> weatherlist,String dayorhour)
	{ long ONE_MINUTE_IN_MILLIS=60000;//millisecs

	Calendar date = Calendar.getInstance();
	long t= date.getTimeInMillis();
	Date s60minback=new Date(t - (60 * ONE_MINUTE_IN_MILLIS));
	DateFormat format1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS", Locale.ENGLISH);
		List<Weather> topartition=sort(weatherlist,dayorhour);
		List<Weather> partioned=new ArrayList();
		if(dayorhour.equalsIgnoreCase("hour"))
		{
			for(Weather w : topartition)
			{
				try {
					if( format1.parse(w.getTimeoftemp().replaceAll("[a-z A-Z]", "")).compareTo(s60minback)>0)
					{
						partioned.add(w);
						
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		}
		return partioned;
	}
	
	public List<Weather> sort (List<Weather> weatherlist,String dayorhour)
	{
		// s4=s4.replaceAll("[a-z A-Z]", "");
	        DateFormat format1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS", Locale.ENGLISH);
		Collections.sort(weatherlist,(a,b)->{
			try {
				return format1.parse(a.getTimeoftemp().replaceAll("[a-z A-Z]", "")).compareTo(format1.parse(b.getTimeoftemp().replaceAll("[a-z A-Z]", "")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		});
		
		
		return weatherlist;
	}*/
	
}
