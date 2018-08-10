package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.IGreetingService;

@Controller
public class ConstructorInjectedController {

	private IGreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
}
