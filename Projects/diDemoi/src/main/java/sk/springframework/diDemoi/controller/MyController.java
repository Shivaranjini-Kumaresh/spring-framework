package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.GreetingService;

@Controller
public class MyController {
	
	@Autowired
	private GreetingService greetingService;

	public String hello() {
		return greetingService.sayHello();
	}
}
