package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignclientServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientServiceRegistryApplication.class, args);
	}

}
