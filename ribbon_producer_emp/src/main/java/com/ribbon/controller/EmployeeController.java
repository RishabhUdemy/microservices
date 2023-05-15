package com.ribbon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Value("${server.port}")
	private String portInfo;
	
	@GetMapping("/empinfo")
	public String getEmpInfo() {
		return "Producer Detail Info:"+portInfo;
	}
}
