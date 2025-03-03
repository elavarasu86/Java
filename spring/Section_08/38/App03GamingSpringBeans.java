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
public class App03GamingSpringBeans {

	/*
	 * I have added @Component on PacmanGame class that will create instance for
	 * PacmanGame class and auto wire that to below function.
	 * 
	 * @Bean public GamingConsole game() { return new PacmanGame(); }
	 */

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		System.out.println("Parameter : " + game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
