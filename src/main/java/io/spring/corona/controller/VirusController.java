package io.spring.corona.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirusController {
	
	@GetMapping("/")
	public String test() {
		return "TOTAL ACTIVE CASES : " + 14112;
	}
	
}
