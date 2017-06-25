package egenproj.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.AbstractEnvironment;

import egenproj.WeatherApp.config.ApplicationConfig;
import egenproj.WeatherApp.config.SwaggerConfig;

//@PropertySource(value="classpath:app.properties")
@SpringBootApplication
@Import({ApplicationConfig.class,SwaggerConfig.class})
public class AppStarter {
public static void main(String[] args) {
	System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod");
	SpringApplication.run(AppStarter.class, args);
	
}
}
