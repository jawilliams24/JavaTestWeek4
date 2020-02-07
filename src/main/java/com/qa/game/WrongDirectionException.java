package com.qa.game;

/**
 * Here is my WrongDirectionException that should be thrown if the user tries to
 * enter anything other than north, south, east or west.
 * Currently it works but then the game doesn't run properly so please re-run the program.
 * 
 * @author James Williams
 */

@SuppressWarnings("serial")
public class WrongDirectionException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Enter north, south, east or west and stop trying to break my game!!\n";
	}

}
