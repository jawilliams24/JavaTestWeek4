package com.qa.game;

import java.util.Scanner;

/**
 * This is the Movement class. This class runs a method that gives the player a
 * choice of movement directions, then runs the method depending on the player's
 * choice.
 * 
 * @author James Williams
 */

public class Movement {

	static int xPos = 0;
	static int yPos = 0;
	static int[] coordinates = { xPos, yPos };

	@SuppressWarnings("resource")
	public static String Movement(String direction) {

		System.out.println("You decide it's time to move.");
		System.out.println("Which direction do you want to move in?");
		System.out.println("Enter 'north','south','east' or 'west': ");

		Scanner moveScan = new Scanner(System.in);
		String move = moveScan.nextLine();

		/**
		 * Below is the switch statement that depends on user input then runs a function
		 * depending on that. That really long mathsy bit is because I couldn't figure
		 * out a simpler way of squaring numbers from an array.
		 */

		switch (move) {
		case "north":
			return "You decide to move " + move + "\nNew distance to finish is: "
					+ Math.sqrt((52 + ((coordinates[0]) * (coordinates[0]) + (coordinates[1]) * (coordinates[1]))));
		case "south":
			return "You decide to move " + move + "\nNew distance to finish is: "
					+ Math.sqrt((52 + ((coordinates[0]) * (coordinates[0]) + (coordinates[1]) * (coordinates[1]))));
		case "east":
			return "You decide to move " + move + "\nNew distance to finish is: "
					+ Math.sqrt((52 + ((coordinates[0]) * (coordinates[0]) + (coordinates[1]) * (coordinates[1]))));
		case "west":
			return "You decide to move " + move + "\nNew distance to finish is: "
					+ Math.sqrt((52 + ((coordinates[0]) * (coordinates[0]) + (coordinates[1]) * (coordinates[1]))));
		}

		/**
		 * This will throw a WrongDirectionException if the user enters anything other
		 * than north, south, east or west.
		 */

		if (direction != "north" && direction != "south" && direction != "east" && direction != "west") {
			throw new WrongDirectionException();
			
		}

		return null;
	}

	/**
	 * Getters and Setters for x and y positions
	 */

	public int getxPos() {
		return xPos;
	}

	@SuppressWarnings("static-access")
	public void setxPos(int xPos) {
		this.xPos = xPos + 1;
	}

	public int getyPos() {
		return yPos;
	}

	@SuppressWarnings("static-access")
	public void setyPos(int yPos) {
		this.yPos = yPos + 1;
	}
}
