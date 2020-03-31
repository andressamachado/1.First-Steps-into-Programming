
import java.util.Scanner;

/**
 * @author: Andressa Machado - 040923007 CST8110 - Introduction to Computer
 *          Programming. Section: 302 Professor: Anissa Shaddy. Practical Exam
 *          this class contain the method getValues, calculateRoot and display.
 *          last updated 10.April.2018
 */
public class LabTest {
	private double value, precision, root;
	private Scanner input;

	public LabTest() {
		input = new Scanner(System.in);

		System.out.println("Program developed by Andressa Machado");
	}

	public void getValues() {

		value = 0;
		System.out.print("Enter a value: ");
		do {
			value = input.nextDouble();
			if (value <= 0) {
				System.out.print("Enter a value that is greater than 0: ");
			}

		} while (value <= 0);

		precision = 0;
		System.out.print("Enter a precision: ");
		do {
			precision = input.nextDouble();
			if (precision < 0) {

				System.out.print("Enter precision that is 0 or greater: ");
			}
		} while (precision < 0);
	}

	public void calculateRoot() {

		double min = 0;
		double max = value + 1;
		double sqr;
		root = (max / 2);

		while ((max - min) > precision) {
			root = ((max + min) / 2);
			sqr = root * root;

			if (sqr >= value) {
				max = root;
			}
			if (sqr <= value) {
				min = root;
			}
		}
	}

	public void display() {

		System.out.print("The square root of " + value + " is " + root);
	}

}
