package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.IGreetingService;

@Controller
public class SetterInjectedController {

	private IGreetingService greetingService;

	public IGreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}
}
