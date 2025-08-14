package com.example.demo;

import java.util.Scanner;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContra;

public class AppGameBasic {

	public static void main(String[] args) {
		
//		This is mannually taking inputs
		
		//This is loose coupling we creted interface and extend to games classes 
//		var game = new MarioGame();
//		var game  = new SuperContra();
		var game = new PacMan();
		
		var gameRunner = new GameRunner(game);
//		object creating + wired of dependency
//		gameRunnner (depend on game) need game to run so the game is dependency
		gameRunner.run();
		
		//This is taking inputs from user
		
//		try(Scanner s = new Scanner(System.in)){
//			
//			System.out.println("Enter Game Name \n 1. mario \n 2. supercontra \n 3. pacMan \n");
//			
//			
//			 String gameName = s.nextLine(); // or "mario", can come from args[0] or user input
//		       
//			 GamingConsole game;
//
//		        switch (gameName.toLowerCase()) {
//		            case "mario":
//		                game = new MarioGame();
//		                break;
//		            case "supercontra":
//		                game = new SuperContra();
//		                break;
//		                
//		            case "pacman" :
//		            	game = new PacMan();
//		            	break;
//		            default:
//		                throw new IllegalArgumentException("Unknown game: " + gameName);
//		        }
//
//		        GameRunner gameRunner = new GameRunner(game);
//		        gameRunner.run();
//			
//		}
		
		
	}
}
