package io.spring.corona.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.spring.corona.service.VirusDataService;

@Controller
public class EnterPage {
	
	VirusDataService virusDataService = new VirusDataService();
	
	@RequestMapping(method = RequestMethod.GET,path = "/")
	public String checkMethod() throws IOException, InterruptedException {
		virusDataService.fetchData();
		return "HELLO";
	}
	
}
