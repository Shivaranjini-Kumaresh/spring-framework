package sk.springframework.diDemoi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from Setter";
	}

}
