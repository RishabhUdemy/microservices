package com.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ribbon.util.RibbonUtil;

@RestController
public class EmployeeInfoDetailController {

	@Autowired
	private RibbonUtil ribbonUtil;
	
	@GetMapping("/showdetail")
	public String getEmpInfoDetail() {
		return ribbonUtil.getHttpResponse();
	}
}
