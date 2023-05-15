package com.ribbon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RibbonUtil {

	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	public String getHttpResponse() {
		
		ServiceInstance si=loadBalancerClient.choose("PRODUCER_EMP_INFO");
		String URL = si.getUri()+"/empinfo";
		RestTemplate restTemplate = new RestTemplate();
		String msg = restTemplate.getForObject(URL, String.class);
		return msg;
	}
}
