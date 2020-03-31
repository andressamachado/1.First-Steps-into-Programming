package assignment3;

/**
 * @author: Andressa Machado - 040923007
 * CST8110 - Introduction to Computer Programming.
 * Section: 302 Professor: Anissa Shaddy. 
 * Assignment #3 - Loops. 
 * This program is a dice betting game. It will prompt the user to enter a valid bet amount and enter a bet type.
 * If the user win, his bet will be doubled and add to his pot amount. Otherwise, he will lose his bet.
 * This class has the main method.
 * last updated March 28th, 2018.
 */

public class Assign3 {

	public static void main(String[] args) {

		Game g = new Game();
		g.playGame();
	}

}
