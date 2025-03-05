package com.elavarasu.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");

	}

	@PostConstruct
	public void initialize() {// Once dependencies are autowired spring will call method annotated with
								// @PostConstruct
		someDependency.getready();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean all the resource");//@PreDestroy will be used to clean up resource.
	}
}

@Component
class SomeDependency {

	public void getready() {
		System.out.println("Some logic using dependencies");

	}

}

@Configuration
@ComponentScan
public class PrePostAnnocationContextLauncherApplication {

	public static void main(String[] args) {

		/*
		 * As soon as all bean are created and dependencies are autowired, we want to
		 * initialize values.
		 */

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnocationContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
