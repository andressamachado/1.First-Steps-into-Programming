/**
 * @author: Andressa Machado - 040923007 
 * CST8110 - Introduction to Computer Programming.
 * Section: 302
 * Professor: Anissa Shaddy.
 * Assignment #2 - Classes and ifs.
 * This program prompts the user to enter two dates and calculate the difference between them. 
 * This class contains the main method which calls all the other methods required to run this application.  
 * last updated March 15th, 2018.
 */

public class Assign2 {

	public static void main(String[] args) {
		DateCalculator dc = new DateCalculator();

		dc.inputDates();
		dc.calculateDifference();
		dc.display();
	}
}
