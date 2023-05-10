package com.feurekaserver.registry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

	@GetMapping("/show")
	public String showMessage() {
		return "Message From Producer";
	}
}
