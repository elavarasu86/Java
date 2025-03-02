
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elavarasu.springframework.game.GameRunner;
import com.elavarasu.springframework.game.GamingConsole;
import com.elavarasu.springframework.game.MarioGame;
import com.elavarasu.springframework.game.PacManGame;
import com.elavarasu.springframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}

	}

}
