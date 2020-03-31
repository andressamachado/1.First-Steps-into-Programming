package assignment3;

import java.util.Scanner;

/**
 * @author: Andressa Machado - 040923007 
 * CST8110 - Introduction to Computer Programming. 
 * Section: 302 
 * Professor: Anissa Shaddy. 
 * Assignment #3 - Loops. 
 * This program is a dice betting game. It will prompt the user to enter a valid bet amount and enter a bet type. If the user win, his bet will be doubled and add to his pot amount.
 * Otherwise, he will lose his bet. 
 * This class has the getValueFromUser method and the playGame method. 
 * last updated March 28th, 2018.
 */

public class Game {

	private int potAmount; // holds the value of the pot
	private int betAmount; // holds the bet value
	private String betType = ""; // holds the bet type
	private Scanner input; // common scanner

	// default (no-arg) constructor
	public Game() {
		potAmount = 100;
		input = new Scanner(System.in);

		System.out.println(
				"Welcome to Double or Nothing Dice Game..bet an amount and type \n \t -if you are correct, you win twice your bet,");
		System.out.println("\t- otherwise you lose your bet");
		System.out.println("A bet of 0 ends the game");
		System.out.println();

	}

	// prompts the user to enter a valid bet amount and type
	public void getBetFromUser() {

		System.out.println("Your current pot is " + potAmount);

		betAmount = 0;

		System.out.print("Enter your bet amount: ");
		do {
			betAmount = input.nextInt();
			if (betAmount < 0 || betAmount > potAmount) {
				System.out.print(
						"Error - cannot bet less than 0 or more than " + potAmount + "... Enter your bet amount: ");
			} else {
				if (betAmount == 0) {
					System.out.print("You end the game with pot of " + potAmount);
					return;

				}
			}
		} while (betAmount < 0 || betAmount > potAmount);
		potAmount -= betAmount;
		
		// here the system asks for the bet type:
		System.out.print("Enter your bet type: ");

		do {
			betType = input.nextLine();
			betType = betType.toLowerCase();
			switch (betType) {
			case "odd":
			case "even":
			case "low":
			case "high":
			case "":
				break;
			default:
				System.out.print("Please enter odd, even, high, or low ....Enter your bet type:");
				break;
			}
		} while (!(betType.equalsIgnoreCase("odd") || betType.equalsIgnoreCase("even")
				|| betType.equalsIgnoreCase("high") || betType.equalsIgnoreCase("low")));
	}

	// logic for the game
	public void playGame() {

		// Array
		Die[] listOfDie = new Die[3];

		do {
			getBetFromUser();
			boolean win = false;
			if (betAmount == 0) {
				break;
			}
			
			for (int die = 0; die < listOfDie.length; die++) {
				listOfDie[die] = new Die();
				listOfDie[die].rollDie();
			}

			System.out.println("Your dies are: " + listOfDie[0].getValue() + " and " + listOfDie[1].getValue() + " and "
					+ listOfDie[2].getValue());

			int sum = 0;

			for (int die = 0; die < listOfDie.length; die++) {
				sum += listOfDie[die].getValue();
			}

			if (betType.equals("even")) {
				if (sum % 2 == 0) {
					System.out.println("You WIN....double your bet");
					System.out.println();
					potAmount += 2 * betAmount;

					win = true;
				}
			}

			if (betType.equals("odd")) {
				if (sum % 2 == 1) {
					System.out.println("You WIN....double your bet");
					System.out.println();
					potAmount += 2 * betAmount;

					win = true;
				}
			}
			if (betType.equals("low")) {
				if (sum < 9) {
					System.out.println("You WIN....double your bet");
					System.out.println();
					potAmount += 2 * betAmount;

					win = true;
				}
			}
			if (betType.equals("high")) {
				if (sum >= 9) {
					System.out.println("You WIN....double your bet");
					System.out.println();
					potAmount += 2 * betAmount;

					win = true;
				}
			}

			if (win == false) {
				System.out.println("You LOSE....your bet");
				System.out.println();

			}
		} while (potAmount > 0);

		if (potAmount == 0) {
			System.out.println("Your current pot is 0 \nYou end the game with a pot of 0");
		}

	}
}
