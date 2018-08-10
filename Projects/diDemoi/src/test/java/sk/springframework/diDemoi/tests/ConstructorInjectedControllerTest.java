package sk.springframework.diDemoi.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sk.springframework.diDemoi.controller.ConstructorInjectedController;
import sk.springframework.diDemoi.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorController;
	
	
	@Before
	public void setUp() {
		this.constructorController  = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void TestSayHello() {
		assertEquals("Hey Hello", constructorController.sayHello());
	}

}
