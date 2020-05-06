package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ViewStatusServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewStatusServiceApplication.class, args);
	}

}