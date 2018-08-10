package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}
}
