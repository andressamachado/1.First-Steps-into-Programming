package assignment3;

import java.util.Random;

/**
 * @author: Andressa Machado - 040923007
 * CST8110 - Introduction to Computer Programming.
 * Section: 302 Professor: Anissa Shaddy. 
 * Assignment #3 - Loops. 
 * This program is a dice betting game. It will prompt the user to enter a valid bet amount and enter a bet type.
 * If the user win, his bet will be doubled and add to his pot amount. Otherwise, he will lose his bet.
 * This class has the dice constructor, the method to simulate the rolling of the dice, and the display
 * method to show the value.
 * last updated March 28th, 2018.
 */

public class Die {

	private int dieValue; // holds the value of the ONE die
	private Random randomNumbers;// common random number generator

	// default (no-arg) constructor
	public Die() {
	}

	// Generate a random value for die
	public void rollDie() {

		Random randomNumbers = new Random();
		dieValue = randomNumbers.nextInt(6);
		dieValue++;
	}

	// Displays the value of die
	public void displayDie() {
		System.out.println(dieValue);
	}

	// Returns value of die
	public int getValue() {
		return dieValue;
	}
}