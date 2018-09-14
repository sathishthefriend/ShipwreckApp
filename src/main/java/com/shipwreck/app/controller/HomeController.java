package com.shipwreck.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String homePage(){
		return "Hello, This is spring boot app";
	}
}
