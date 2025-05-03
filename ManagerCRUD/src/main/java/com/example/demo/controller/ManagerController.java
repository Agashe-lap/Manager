package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

	@GetMapping("/")
	public String home() {
		return "Hello World<br> We are Learning Spring Boot<br>Welcome Sarvesh !!";
	}
	
	
}
