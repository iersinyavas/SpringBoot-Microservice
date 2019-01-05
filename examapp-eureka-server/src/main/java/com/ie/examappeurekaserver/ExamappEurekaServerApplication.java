package com.ie.examappeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExamappEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamappEurekaServerApplication.class, args);
	}

}

