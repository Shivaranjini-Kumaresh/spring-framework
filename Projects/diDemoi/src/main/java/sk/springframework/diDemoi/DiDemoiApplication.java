package sk.springframework.diDemoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sk.springframework.diDemoi.controller.ConstructorInjectedController;
import sk.springframework.diDemoi.controller.MyController;
import sk.springframework.diDemoi.controller.PropertyInjectedController;
import sk.springframework.diDemoi.controller.SetterInjectedController;

@SpringBootApplication
public class DiDemoiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoiApplication.class, args);
		System.out.println(context.getBean(MyController.class).hello());
		
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
