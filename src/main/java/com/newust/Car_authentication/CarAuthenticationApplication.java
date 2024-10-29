package com.newust.Car_authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CarAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarAuthenticationApplication.class, args);
	}

}

