package com.elavarasu.springframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		/*
		 * Spring context will be created inside JVM. Spring will manager objects.
		 */

		// Lauch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// Configure the thing that spring want to manage for us.
		// Retrieve bean managed by spring.
		System.out.println(context.getBean("name"));

		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));

		System.out.println(context.getBean("person2MethodCall"));

		System.out.println(context.getBean("person3Parameters"));

		// Here we are calling bean via name.
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean(Person.class));

		// Here we are calling bean via type not by name.
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person5Qualifier"));

		// List all the bean managed by spring container.
		// To print all beans we are using functional programming.
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
