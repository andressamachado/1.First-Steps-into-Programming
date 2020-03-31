import java.util.Scanner;

/**
 * @author: Andressa Machado - 040923007 
 * CST8110 - Introduction to Computer Programming.
 * Section: 302
 * Professor: Anissa Shaddy.
 * Assignment #2 - Classes and ifs.
 * This program prompts the user to enter two dates and calculate the difference between them. 
 * This class will prompt the user to insert his data as well as will prompt the result of the difference between the two dates. Professor:
 * last updated March 15th, 2018.
 */

public class OurDate {

	
	private int month;
	private int day;
	private int year;
	private Scanner input;

	
	public OurDate() {

		input = new Scanner(System.in);

	}

	public OurDate(int y, int m, int d, String ab) {

		year = y;
		month = m;
		day = d;
		input = new Scanner(System.in);
	}

	// method get values
	public void inputYear() {

		year = 0;
		System.out.print("Enter a year: ");
		year = input.nextInt();
	}

	public void inputMonth() {

		month = 1;
		System.out.print("Enter a month: ");
		do {
			month = input.nextInt();
			if (month > 12 || month < 1) {
				System.out.println();
				System.out.println("Your input for this section cannot be greater than 12 or less than 1.");
				System.out.println();
				System.out.print("Enter your month again: ");
			}
		} while (month > 12 || month < 1);
	}

	public void inputDay() {

		day = 1;
		System.out.print("Enter a day: ");
		do {
			day = input.nextInt();
			if (day > 31 || day < 1) {
				System.out.println();
				System.out.println("Your input for this section cannot has more than 31 days.");
				System.out.println();
				System.out.print("Please enter your day again: ");
			}
		} while (day > 31 || day < 1);
	}

	public void displayDate() {

		System.out.printf("%d/%d/%d", year, month, day);
	}

	public int calcDays() {

		int result = year * 360 + (month - 1) * 30 + day;

		return result;
	}
}
