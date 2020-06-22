package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.*;
@SpringBootApplication
public class SpringApIsv2Application {

	private static final Logger logger = LogManager.getLogger(SpringApIsv2Application.class);
	public static void main(String[] args) {
		
		logger.info("Start the Spring Boot Application - Harshesh");
		SpringApplication.run(SpringApIsv2Application.class, args);
	}

}
