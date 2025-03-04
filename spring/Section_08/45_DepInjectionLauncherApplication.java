package com.elavarasu.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	/*
	 * Dependency Injection using Field based.
	 */

	// @Autowired annotation will be used to wire dependencies automatically. If you
	// remove this dependencies will not be wired.
	@Autowired
	Dependency1 dependency1;

	@Autowired
	Dependency2 dependency2;

	public String toString() {

		// using toString method to check dependencies injected.
		return "Using " + dependency1 + " " + dependency2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	/*
	 * Dependency Injection Types: 1. Constructor Based: Dependencies are set by
	 * creating the Bean using its Constructor. 2. Setter Based: Dependencies are
	 * set by calling setter methods on your beans. 3. Field Based: No setter or
	 * constructor. Dependency is injected using reflection.
	 */

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));

		}

	}

}
