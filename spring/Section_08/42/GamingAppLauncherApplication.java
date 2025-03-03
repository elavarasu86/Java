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
	
	/*@Primary - A bean should be given preference when multiple condidates are qualified.
	 *@Qualifier - A specific bean should be auto-wired(name of the bean can be used as qualifier)
	 * As part of this step Let's add @Component to all the three games. 
	 * 
	 * Sprint will through error as we have three class with same type(GamingConsole).
	 * For example: expected single matching bean but found 2: marioGame,pacmanGame
	 * To avoid failure we can add @Primary and @Qualifier annotations.
	 */

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
