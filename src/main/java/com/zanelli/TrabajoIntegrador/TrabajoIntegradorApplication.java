package com.zanelli.TrabajoIntegrador;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TrabajoIntegradorApplication {

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(TrabajoIntegradorApplication.class, args);
	}

}
