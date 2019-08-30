package com.qa.Asessment;

import java.util.Scanner;

public class Map extends Game{
	private int xSize = 0;
	private int ySize = 0;
	private int mapX;
	private int mapY;
	
	//get x position
	public int getXSize() {
		return this.mapX;
	}
	//get y position
	public int getYSize() {
		return this.mapY;
	}
	
	public void createMap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How big do you want the map:");
		System.out.println("Please enter the size of the X axis");
		try {
			this.mapX = sc.nextInt();
			//sc.nextLine();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Incorrect input");
		}
		System.out.println("Please enter the size of the y axis");
		try {
			this.mapY = sc.nextInt();
			sc.nextLine();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Incorrect input");
		}
		

	}

}
