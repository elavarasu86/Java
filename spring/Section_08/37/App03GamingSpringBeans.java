package com.elavarasu.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.elavarasu.learn_spring_framework.game.GameRunner;
import com.elavarasu.learn_spring_framework.game.GamingConsole;
import com.elavarasu.learn_spring_framework.game.PacmanGame;

/*
 *   Step1: 
 *   Instead of having separate GamingConfiguration java file we are moving GamingConfiguration into launcher class

@Configuration
class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
Step1 changes are end here.
 */

@Configuration
public class App03GamingSpringBeans {

	/*
	 * As part of step 2 we have moved @Bean methods into launcher class, by this way we can remove GamingConfiguration class.
	 */
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {
		
		//Step2 we have change GamingConfiguration.class into App03GamingSpringBeans.class as all the beans are now moved into laucher class.
		// NOTE: STILL WE ARE CREATING BEAN NOT SPRING.

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
