package com.feurekaserver.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstegEurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstegEurekaProducerApplication.class, args);
	}

}
