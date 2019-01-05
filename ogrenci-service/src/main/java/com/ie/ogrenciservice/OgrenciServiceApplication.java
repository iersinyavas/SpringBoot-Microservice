package com.ie.ogrenciservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OgrenciServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OgrenciServiceApplication.class, args);
	}

}

