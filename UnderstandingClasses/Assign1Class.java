
/** @author: Andressa Machado - 040923007
 * Assignment #1 for CST8110 - Introduction to Computer Programming.
 * This program promps user to enter their grades and them calculate their Computer Essentials final grade.
 * Professor: Anissa Shaddy. 
 * Section: 302 
 * last updated 13.feb.2018
 */

public class Assign1Class {
	public static void main(String[] args) {
		MarkCalculator firstStudent = new MarkCalculator();
		firstStudent.getValues();
		firstStudent.calculateGrades();
		firstStudent.displayGrades();
	}
}
	