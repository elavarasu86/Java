package com.elavarasu.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some Initialization");// After adding @Lazy annotation this piece of code will not be
													// executed. If we remove @Lazy "Some Initialization" will be
													// printed.
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("doSomething!");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	/*
	 * Default initialization is Eager
	 * 
	 * As part of this exercise we are trying Lazy initialization. Lazy
	 * initialization is, when a class is used in the code then instance for that
	 * class is created. If a class is not used in the code then instance will not
	 * be created.
	 */

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println("All initialization are now completed.");

			context.getBean(ClassB.class).doSomething();

		}

	}

}
