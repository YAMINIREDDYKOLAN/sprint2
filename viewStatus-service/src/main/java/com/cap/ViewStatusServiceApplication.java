package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ViewStatusServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewStatusServiceApplication.class, args);
	}

}
