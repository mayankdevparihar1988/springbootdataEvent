package com.eventmanagment.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventManagementSpringBootApplication.class,Jsr310Converters.class})
public class EventManagementSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventManagementSpringBootApplication.class, args);
	}

}
