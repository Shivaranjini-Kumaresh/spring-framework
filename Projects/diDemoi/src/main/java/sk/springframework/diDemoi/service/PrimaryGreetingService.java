package sk.springframework.diDemoi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({ "en", "default" })
public class PrimaryGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello From Primary Service";
	}

}
