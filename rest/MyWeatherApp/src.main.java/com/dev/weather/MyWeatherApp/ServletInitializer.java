package com.dev.weather.MyWeatherApp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("ServletInitializer");
		return new Class[] { WebConfiguration.class };
	}
	

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		//System.out.println("ServletInitializer");
		return new String[] { "/api/*" };
	}
	}

	
	
	
	
	
	
	
	
