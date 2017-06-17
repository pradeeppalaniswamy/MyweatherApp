package Egenproj.WeatherApp.Service.Impl;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Egenproj.WeatherApp.Entity.Wind;
import Egenproj.WeatherApp.Repository.WindRepository;
import Egenproj.WeatherApp.Service.WindService;
@Service
public class WindServiceImpl implements WindService {
	
private WindRepository windrepository;
	public WindServiceImpl(WindRepository windrepository) {
	//super();
	this.windrepository = windrepository;
}
	@Override
	@Transactional
	public Wind saveWind(Wind wind) {
		// TODO Auto-generated method stub
		return windrepository.saveWind(wind);
	}

}
