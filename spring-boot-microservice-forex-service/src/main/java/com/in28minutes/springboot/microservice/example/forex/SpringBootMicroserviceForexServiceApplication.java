package com.in28minutes.springboot.microservice.example.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMicroserviceForexServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
	}
}
