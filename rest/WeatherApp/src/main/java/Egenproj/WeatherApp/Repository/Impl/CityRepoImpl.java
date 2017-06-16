package Egenproj.WeatherApp.Repository.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Egenproj.WeatherApp.Entity.City;
import Egenproj.WeatherApp.Repository.CityRepository;
@Repository
public class CityRepoImpl implements CityRepository{

	@Override
	public List<City> findallCity() {
		// TODO Auto-generated method stub
		List<City> citylist =new ArrayList<City>();
		City c1 =new City ();
		c1.setName("kingsville");
		citylist.add(c1);
		
		return citylist;
	}

}
