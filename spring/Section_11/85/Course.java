package com.elavarasu.springboot.learn_spring_boot;

public class Course {

	private long id;
	private String name;
	private String collage;

	public Course(long id, String name, String collage) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCollage() {
		return collage;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", collage=" + collage + "]";
	}

}
