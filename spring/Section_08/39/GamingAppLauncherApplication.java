package com.elavarasu.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.elavarasu.learn_spring_framework.game.GameRunner;
import com.elavarasu.learn_spring_framework.game.GamingConsole;
import com.elavarasu.learn_spring_framework.game.PacmanGame;

@Configuration
@ComponentScan("com.elavarasu.learn_spring_framework.game")
public class GamingAppLauncherApplication {


	/*
	 * Even after removing this commented code spring will create object and auto wire dependencies. 
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		System.out.println("Parameter : " + game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	*/

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
