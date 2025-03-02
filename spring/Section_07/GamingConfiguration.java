import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.elavarasu.springframework.game.GameRunner;
import com.elavarasu.springframework.game.GamingConsole;
import com.elavarasu.springframework.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
