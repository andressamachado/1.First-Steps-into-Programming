import java.util.Scanner;

/** @author: Andressa Machado - 040923007
 * Lab4 for CST8110 - Introduction to Computer Programming.
 * This program promps user to enter their grades and them calculate their Computer Essentials final grade.
 * Professor: Anissa Shaddy. 
 * Section: 302 
 * last updated 13.feb.2018
 */

public class MarkCalculator {
	
	//it has 8 fields
	private double test;
	private double hybrid;
	private double lab;
	private double finalExam;
	private double theory;
	private double practical;
	private double finalGrade;
	private Scanner input;
	
	// Default constructor
	public MarkCalculator() {
		
		input = new Scanner (System.in); 
		
		System.out.println("Welcome to the CST8101 Final Mark Calculator");
		System.out.println(); 
	}
		
	// get values 
	public void getValues () { 
		
		lab = 0;
		System.out.print("Enter your lab Assignments mark out of 25: ");
		do {
			lab = input.nextDouble();
			if (lab>25 || lab<0) {
				System.out.println("Your grade cannot be greater than 25 or less than zero.");
				System.out.print("Enter your lab Assignments mark out of 25: ");
				}
		} while (lab>25 || lab<0);
			
		hybrid = 0;
		System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
		do {
			hybrid = input.nextDouble();
			if (hybrid>20 || hybrid<0) {
				System.out.println("Your grade cannot be greater than 20 or less than zero.");
				System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
			}
		} while (hybrid>20 || hybrid<0);

	
		test = 0;
		System.out.print("Enter your Test mark out of 25: ");
		do {
			test = input.nextDouble();
			if (test>25 || test<0) {
				System.out.println("Your grade cannot be greater than 25 or less than zero.");
				System.out.print("Enter your Test mark out of 25: ");
			}
		} while (test>25 || test<0);

		
		finalExam = 0;
		System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
		do {
			finalExam = input.nextDouble();
			if (finalExam>30 || finalExam<0) {
				System.out.println("Your grade cannot be greater than 30 or less than zero.");
				System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
			}
		} while (finalExam>30 || finalExam<0);
		System.out.println();
	}

	public void calculateGrades () { 
		// Here starts the calculation for the Practical grade. 
		practical = (hybrid+lab)/45 * 100;
		hybrid = (hybrid/20) * 0.20;
		lab = (lab/25) * 0.25;
		
		// Here starts the calculation for the Theory grade. 
		theory = (test+finalExam)/55 * 100;
		test = (test/25) * 0.25; 
		finalExam = (finalExam/30) * 0.30;
		
		// Here starts the calculation for the Final grade. 
		finalGrade = lab+hybrid+test+finalExam * 100;
		
	}			

	public void displayGrades () {

		System.out.printf ("Theory grade: %.2f%%", theory) ;
		System.out.println();
		
		System.out.printf ("Practical grade: %.2f%%" , practical);
		System.out.println();
		
		System.out.printf ("Final grade: %.2f%%" , finalGrade );
		System.out.println();
	}
}
