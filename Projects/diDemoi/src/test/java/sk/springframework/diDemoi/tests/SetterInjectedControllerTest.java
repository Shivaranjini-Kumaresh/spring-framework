package sk.springframework.diDemoi.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sk.springframework.diDemoi.controller.SetterInjectedController;
import sk.springframework.diDemoi.service.GreetingServiceImpl;
import sk.springframework.diDemoi.service.IGreetingService;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterController;

	IGreetingService greetingService;

	@Before
	public void setUp() {
		this.greetingService = new GreetingServiceImpl();
		this.setterController = new SetterInjectedController();
		setterController.setGreetingService(greetingService);
	}
	
	@Test
	public void TestSayHello() {
		assertEquals("Hey Hello", setterController.sayHello());
	}

}
