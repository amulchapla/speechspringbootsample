package com.amc.speechspringbootsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot from amc speech proj!";
	}

	@GetMapping("/api/sayhello")
	public String sayhello() {
		return "Custom Hello from api sayhello from amc speech proj!";
	}

}
