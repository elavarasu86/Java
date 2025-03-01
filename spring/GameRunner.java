package com.elavarasu.springframework.game;

public class GameRunner {

	//By implementing GamingCole we are loosely coupling the code.
	GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// Just displaying game instance. May be memory details will be printed here.
		System.out.println("Running: " + game);

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
