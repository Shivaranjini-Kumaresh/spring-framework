package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.IGreetingService;

@Controller
public class MyController {
	
	@Autowired
	private IGreetingService greetingService;

	public String hello() {
		return greetingService.sayHello();
	}
}
