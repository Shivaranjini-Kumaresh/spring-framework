package sk.springframework.diDemoi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemo
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("In Post Construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("In Pre Destroy");
	}
	
	public void beforeInit() {
		System.out.println("In Before Init");
	}
	
	public void AfterInit() {
		System.out.println("In After Init");
	}

	public BeanLifeCycleDemo() {
		super();
		System.out.println("In Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("In Application Context");		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("In Bean Factory");		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("My Bean Name" + name);		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In After Property set");		
	}

}
