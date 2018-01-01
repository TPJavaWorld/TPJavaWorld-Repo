package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("getmsg")
	public String getMessage() {
		return "Hello, Welcome To Boot Project";
	}
}
