package com.feurekaserver.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstegEurekaServiceregApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstegEurekaServiceregApplication.class, args);
	}

}
