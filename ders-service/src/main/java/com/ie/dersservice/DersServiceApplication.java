package com.ie.dersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DersServiceApplication.class, args);
	}

}

