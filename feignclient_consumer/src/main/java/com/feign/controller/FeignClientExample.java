package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.util.EmpFeignClientI;

@RestController
public class FeignClientExample {

	@Autowired
	private EmpFeignClientI empFeignClientI;
	@GetMapping("/info")
	public String getInfo() {
		return "Cosumer:"+empFeignClientI.printPortDetail();
	}
}
