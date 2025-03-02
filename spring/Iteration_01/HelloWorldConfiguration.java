package com.elavarasu.springframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 * Eliminate verbosity in creating Java Beans public accessor methods,
 * constructor, equals, hashcode and toString are automatically created.
 */
record Person(String name, int age, Address address) {
};

record Address(String Street, String city) {
};

//Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions andservice requests for those beans at runtime,
@Configuration
public class HelloWorldConfiguration {

	// Indicates that a method produces a bean to be managed by the Spring
	// container.
	@Bean
	public String name() {
		return "Elavarasu";
	}

	// Default name of Bean is function Name.
	@Bean
	public int age() {
		return 20;
	}

	@Bean
	public Person person() {
		return new Person("Mike", 35, new Address("Henderson", "New York"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());// Values are assigned via Method call:
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);// Values are assigned via Parameters:
	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);// Values are assigned via Parameters:
	}

	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name, age, address);// Values are assigned via Parameters:
	}

	// We can change default name of bean and give custom name like below one.
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Bethal", "Columbus");
	}

	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("Mill Lane", "Madurai");
	}
}
