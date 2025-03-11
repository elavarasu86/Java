package com.elavarasu.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component @Named annotation replaced @Component
@Named
class BusinessService {
	DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	// @Autowired @Inject replaced @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}

}

//@Component @Named annotation replaced @Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	/*
	 * To Implement Contexts and Dependency Injection(CDI) we need to add
	 * dependencies in POM.XML
	 * 
	 * <dependency> <groupId>jakarta.inject</groupId>
	 * <artifactId>jakarta.inject-api</artifactId> <version>2.0.1</version>
	 * </dependency>
	 * 
	 * CDI is a specification(interface) Spring Framework implements CDI
	 */

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessService.class).getDataService());

		}

	}

}
