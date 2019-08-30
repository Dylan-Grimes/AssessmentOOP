package com.qa.Asessment;

public class Player extends Game{
	private int playerXPos = 0;
	private int playerYPos = 0;

	private int goalXPos = 0;
	private int goalYPos = 0;
	private int playerLives = 10;
	
	public Player() {
	}

	public void moveNorth() {
		this.playerYPos ++;
	}
	public void moveEast() {
		this.playerXPos ++;
	}
	public void moveSouth() {
		this.playerYPos --;
	}
	
	public void moveWest() {
		this.playerXPos --;
	}
	
	public void setPlayerXPosition(int playerXpos) {
		this.playerXPos = playerXpos;
	}	
	
	public void setPlayerYPosition(int playerYpos) {
		this.playerYPos = playerYpos;
	}
	
	public void setGoalXPosition(int goalXpos) {
		this.goalXPos = goalXpos;
	}	
	
	public void setGoalYPosition(int goalYpos) {
		this.goalYPos = goalYpos;
	}
	
	public int getPlayerXPosition() {
		return this.playerXPos;
	}
	public int getPlayerYPosition() {
		return this.playerYPos;
	}
	public int getGoalXPosition() {
		return this.goalXPos;
	}
	public int getGoalYPosition() {
		return this.goalYPos;
	}
	
	public int getPlayerLives() {
		return this.playerLives;
	}
	
	public void setPlayerLives(int lives) {
		this.playerLives -= lives;
	}
	//calculate distance
	private float calculateDistance() {
		double playerX = this.playerXPos;
		int playerY = this.playerYPos;
		int goalX = this.goalXPos;
		int goalY = this.goalYPos;
		double xDistance;
		int yDistance;
		float distance;
		
		xDistance = (goalX - playerX) * (goalX - playerX);
		yDistance = (goalY - playerY) * (goalY - playerY);
		distance = (float) Math.sqrt(xDistance + yDistance);

		return distance;
	}
	
	public float getDistance() {
		return calculateDistance();
	}
	
}
