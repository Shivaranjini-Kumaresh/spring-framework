package sk.springframework.diDemoi.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sk.springframework.diDemoi.controller.PropertyInjectedController;
import sk.springframework.diDemoi.service.GreetingServiceImpl;
import sk.springframework.diDemoi.service.GreetingService;

public class PropertyInjectedControllerTest {

	PropertyInjectedController propertyController;
	
	GreetingService greetingService;
	
	@Before
	public void setUp() {
		this.greetingService = new GreetingServiceImpl();
		this.propertyController  = new PropertyInjectedController();
		propertyController.greetingServiceImpl = greetingService;
	}
	
	@Test
	public void TestSayHello() {
		assertEquals("Hey Hello", propertyController.sayHello());
	}

}
