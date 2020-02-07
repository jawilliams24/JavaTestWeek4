package com.qa.game;

/**
 * This is the Runner class for my Infinite Terrain Swamp game.
 * If you decide to test to see if inputs other than north, south,
 * east or west work, it will throw a WrongDirectionException.
 * This kind of breaks the game, even though it still seems to run.
 * I would recommend re-running the program.
 * @author James Williams
 *
 */

public class Runner {

	public static void main(String[] args) {

		System.out.println("You are standing in what looks like a swamp.\n"
				+ "You are surrounded by stinking murky water and there are some strange\n"
				+ "plants that you don't recognise. You notice a small circular device in your\n"
				+ "hand. It looks kind of like a pocket watch, but doesn't tell the time.\n"
				+ "It has north, south, east, west on it where there should be times.\n"
				+ "It looks like a compass and hopefully it'll be able to help you escape\n"
				+ "this disgusting swamp.");

		/**
		 * The below code will run the Movement method that allows a player to move in a
		 * direction of their choosing.
		 */

		try {

			String direction = Movement.Movement(null);
			System.out.println(direction);

			/**
			 * At the moment, the program is hard coded to finish when the player reaches a
			 * certain point. In the future, this could be changed to have a Math.Random()
			 * method called to assign this.
			 */

			while (Movement.xPos != -6 && Movement.yPos != -4) {
				Movement.Movement(null);
				System.out.println(direction);
			}
			System.out.println("You find a chest with a framed, signed photograph of James Williams in it.\n");
			System.out.println("Well done, you got the ultimate prize and you completed the game!");

			/**
			 * Below is the catch statement for my WrongDirectionException Currently, if you
			 * do this, you can continue the game, however it will no longer tell you how
			 * far from the finish destination you are. Currently trying to fix this. There
			 * are only duplicated bits of code below because I couldn't figure out how to
			 * tell the catch statement to send the program back to the try statement.
			 */

		} catch (WrongDirectionException e) {
			System.out.println(e.getMessage());
			Movement.Movement(null);
			String direction = Movement.Movement(null);
			System.out.println(direction);
		}

		/**
		 * Below is my message to the user that currently they will never see. This is
		 * because I couldn't figure out how to make the code work without the methods
		 * being static, but this means that you will be in an infinite loop
		 * 7.211102550927978 metres away from the finish position.
		 */

	}

}
