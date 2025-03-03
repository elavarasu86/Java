package com.elavarasu.learn_spring_framework.game;

import org.springframework.stereotype.Component;

//Using @Component annotation on a class will let Spring 
@Component
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}

	public void down() {
		System.out.println("Down");
	}

	public void right() {
		System.out.println("Right");
	}

	public void left() {
		System.out.println("Left");
	}

}
