package assignment1;

import java.util.Scanner;

/** @author: Andressa Machado - 040923007
 * Assignment #1 for CST8110 - Introduction to Computer Programming.
 * This program promps user to enter their grades and them calculate their Computer Essentials final grade.
 * Professor: Anissa Shaddy. 
 * Section: 302 
 * last updated 13.feb.2018
 */

public class Assign1 {

	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in); 
			
		System.out.println("Welcome to the CST8101 Final Mark Calculator");
		System.out.println();
		
		double lab = 0;
		System.out.print("Enter your Lab Assignments mark out of 25: ");
		do {
			lab = input.nextDouble();
			if (lab>25 || lab<0) {
				System.out.println("Your grade cannot be greater than 25 or less than zero.");
				System.out.print("Enter your Lab Assignments mark out of 25: ");
			}
		} while (lab>25 || lab<0);
		
		
		double hybrid = 0;
		System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
		do {
			hybrid = input.nextDouble();
			if (hybrid>20 || hybrid<0) {
				System.out.println("Your grade cannot be greater than 20 or less than zero.");
				System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
			}
		} while (hybrid>20 || hybrid<0);
		
		
		double test = 0;
		System.out.print("Enter your Test mark out of 25: ");
		do {
			test = input.nextDouble();
			if (test>25 || test<0) {
				System.out.println("Your grade cannot be greater than 25 or less than zero.");
				System.out.print("Enter your Test mark out of 25: ");
			}
		} while (test>25 || test<0);
		
		
		double finalgrade = 0;
		System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
		do {
			finalgrade = input.nextDouble();
			if (finalgrade>30 || finalgrade<0) {
				System.out.println("Your grade cannot be greater than 30 or less than zero.");
				System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
			}
		} while (finalgrade>30 || finalgrade<0);
		System.out.println();
		
		// Here starts the calculation for the Theory grade. 
		System.out.printf ("Theory grade: %.2f%%" , (test+finalgrade)/55 * 100 );
		System.out.println();
		test = (test/25) * 0.25; 
		finalgrade = (finalgrade/30) * 0.30;
		
		// Here starts the calculation for the Practical grade. 
		System.out.printf ("Practical grade: %.2f%%" , (hybrid+lab)/45 * 100 );
		System.out.println();
		hybrid = (hybrid/20) * 0.20;
		lab = (lab/25) * 0.25;
		
		// Here starts the calculation for the Final grade. 
		System.out.printf ("Final grade: %.2f%%" , (lab+hybrid+test+finalgrade) * 100 );
		System.out.println();
	
		
		input.close();
	}

}

