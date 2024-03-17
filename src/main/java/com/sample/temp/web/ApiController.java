package com.sample.temp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/sample")
	public String getSample() {
		return "success GET";
	}
	
	@PostMapping("/sample")
	public String postSample() {
		return "success POST";
	}
}
