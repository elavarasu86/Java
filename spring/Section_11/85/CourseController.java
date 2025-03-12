package com.elavarasu.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	/*
	 * This is Simple Hello World API using Spring Boot.
	 */
	
	//@RequestMapping annotation help to display course details when we reach /courses path.
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Physics", "MKU"), new Course(2, "Computer", "Velammal"));
	}

}
