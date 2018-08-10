package sk.springframework.diDemoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sk.springframework.diDemoi.service.IGreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImpl")
	public IGreetingService greetingServiceImpl; //matching bean name But when primary given , it would take primary bean

	public String sayHello() {
		return greetingServiceImpl.sayHello();
	}
}
