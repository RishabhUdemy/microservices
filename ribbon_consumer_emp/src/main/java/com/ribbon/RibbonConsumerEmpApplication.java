package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonConsumerEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerEmpApplication.class, args);
	}

}
