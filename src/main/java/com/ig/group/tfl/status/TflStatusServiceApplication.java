package com.ig.group.tfl.status;

import org.springframework.cache.annotation.EnableCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cache.annotation.EnableCaching
public class TflStatusServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TflStatusServiceApplication.class, args);
	}

}
