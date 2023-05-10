package com.feurekaserver.registry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumer {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/message")
	public String getMessage() {
		String url = "";
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> listServiceInstances = discoveryClient.getInstances("PRODUCER_FIRSTEX");
		ServiceInstance serviceInstance = listServiceInstances.get(0);
		
		url = serviceInstance.getUri()+"/show";
		
		String message = restTemplate.getForObject(url, String.class);
		return "Message is comring From:"+message;
	}
}
