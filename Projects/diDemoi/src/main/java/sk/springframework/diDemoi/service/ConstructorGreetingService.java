package sk.springframework.diDemoi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from Construtor";
	}

}
