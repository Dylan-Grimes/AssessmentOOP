package com.qa.Asessment;

import java.util.Scanner;

public class Game {

	public void gameStart() {
		Map map = new Map();
		map.createMap();
		//System.out.println(map.getXSize() + ", " + map.getYSize());
		//System.out.println(map.getDistance());
	//}
	
	//public void setPosition() {
		//Map map = new Map();
		Player player = new Player();
		int a = map.getXSize();
		int b = map.getYSize();
		double random = Math.random();
		int playerXPosition = (int) Math.floor(random * a);
		player.setPlayerXPosition(playerXPosition);
		
		double random1 = Math.random();
		int playerYPosition = (int) Math.floor(random1 * b);
		player.setPlayerYPosition(playerYPosition);
		
		double random2 = Math.random();
		int goalXPosition = (int) Math.floor(random2 * a);
		player.setGoalXPosition(goalXPosition);
		
		double random3 = Math.random();
		int goalYPosition = (int) Math.floor(random3 * b);

		player.setGoalYPosition(goalYPosition);

	//}
	
	//public void gameRun() {
		
		//Player player = new Player();
		System.out.println("Grey foggy clouds float oppressively close to you, \n"
				+ "reflected in the murky grey water which reaches up your shins \n"
				+ "Some black plants barely poke out of the water."
				+ "You notice a small watch-like device in your left hand."
				+ "It has hands like a watch, but hands dont seem to tell the time.");
		displayMenu();
		
		Scanner userChoice = new Scanner(System.in);
		String move = "";
		
		boolean endGame = true;

		
		while(endGame == true || player.getPlayerLives() == 0) {
			move = userChoice.nextLine();
			switch(move) {
			case "north":
				player.moveNorth();
				randomMessage();
				System.out.println("Your only hope is " + player.getDistance() + "m away");
				if (player.getDistance() == 0.0) {
					endGame = false;
				};
				displayMenu();
				break;
			case "east":
				player.moveEast();
				randomMessage();
				System.out.println("Your only hope is " + player.getDistance() + "m away");
				if (player.getDistance() == 0.0) {
					endGame = false;
				};
				displayMenu();
				break;
			case "south":
				player.moveSouth();
				randomMessage();
				System.out.println("Your only hope is " + player.getDistance() + "m away");
				if (player.getDistance() == 0.0) {
					endGame = false;
				};
				displayMenu();
				break;
			case "west":
				player.moveWest();	
				randomMessage();
				System.out.println("Your only hope is " + player.getDistance() + "m away");
				if (player.getDistance() == 0.0) {
					endGame = false;
				};
				displayMenu();
				break;
			default:
				System.out.println("Incorrect input. Retry.");
				break;
			}
		}
		
		System.out.println("You escaped!");
		
		
	}

	public static void displayMenu() {
	    System.out.println("\n-------------------------------------\n"
	    		+ "Try 'north', 'east', 'south', 'west'");
	}
	
	public static void randomMessage() {
		double r = Math.random();
		int num = (int) Math.floor(r * 10);
		if (num == 1) {
			System.out.println("You hear nothing...");
		}else if (num ==2) {
			System.out.println("A branch breaks in the distance");
		}else if (num ==3) {
			System.out.println("You fall into a trench. Lose 1 life.");
			
		}else if (num ==4) {
			System.out.println("You encounter a swamp thing. Lose 5 lives.");
		}else if (num ==5) {
			System.out.println("You find an apple. Gain 1 life.");
		}else if (num ==6) {
			System.out.println("...");
		}else if (num ==7) {
			System.out.println("...");
		}else if (num ==8) {
			System.out.println("...");
		}else if (num == 9) {
			System.out.println("...");
		}else if (num ==10) {
			System.out.println("...");
		}
	}
	

}
