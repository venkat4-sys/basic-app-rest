package com.ft.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/msg")
	public String getWelcomeMsg() {
		return "welcome to springboot lectures demo welcome";
	}

}
