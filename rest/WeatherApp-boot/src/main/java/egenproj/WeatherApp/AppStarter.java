package egenproj.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import egenproj.WeatherApp.config.ApplicationConfig;
import egenproj.WeatherApp.config.SwaggerConfig;

@PropertySource(value="classpath:app.properties")
@SpringBootApplication
@Import({ApplicationConfig.class,SwaggerConfig.class})
public class AppStarter {
public static void main(String[] args) {
	SpringApplication.run(AppStarter.class, args);
}
}
