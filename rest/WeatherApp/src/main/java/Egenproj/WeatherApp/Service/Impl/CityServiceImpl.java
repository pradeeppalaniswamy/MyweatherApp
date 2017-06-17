package Egenproj.WeatherApp.Service.Impl;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



import org.springframework.stereotype.Service;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Repository.CityRepository;
import Egenproj.WeatherApp.Service.CityService;
@Service
public class CityServiceImpl implements CityService {
private CityRepository cityrepository;

public CityServiceImpl(CityRepository cityrepository) {

	this.cityrepository = cityrepository;
}
@Transactional
@Override
public List<City> findallCity() {
	// TODO Auto-generated method stub
	return cityrepository.findallCity();
}
@Transactional
@Override
public City savecity(City city) {
	// TODO Auto-generated method stub
	return cityrepository.savecity(city);
}
@Override
public City ifCityExists(String cityname) {

		List<City> allcity=cityrepository.findallCity();
		for(City c1 : allcity)
		{
		if(	c1.getName().equalsIgnoreCase(cityname))
		{
		return c1;	
		}
		/*can use j8*/
		}
		System.out.println("no matching city");
		return null;
	}
@Transactional
@Override
public void update(City city) {
	// TODO Auto-generated method stub
	cityrepository.update(city);
	
}
	

}
