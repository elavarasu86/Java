package com.elavarasu.springframework;

import com.elavarasu.springframework.game.GameRunner;
import com.elavarasu.springframework.game.MarioGame;
import com.elavarasu.springframework.game.PacManGame;
import com.elavarasu.springframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// Var is a type inference Allows the compiler to infer type of the variable
		// based on the value assigned.
		// Code is loosely coupled by including GamingConsole interface.

		//var game = new MarioGame();
		var game = new PacManGame();

		// var game = new SuperContraGame();
		var gameRunner = new GameRunner(game); //creating a object and wiring dependencies.
		gameRunner.run();

	}

}
