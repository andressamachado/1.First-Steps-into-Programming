/**
 * @author: Andressa Machado - 040923007 
 * CST8110 - Introduction to Computer Programming.
 * Section: 302
 * Professor: Anissa Shaddy.
 * Assignment #2 - Classes and ifs.
 * This program prompts the user to enter two dates and calculate the difference between them. 
 * This class contains all necessary methods to calculate this difference and the orders to prepare the message output as a result of this application .
 *last updated March 15th, 2018.
 */

public class DateCalculator {

	private OurDate firstDate;
	private OurDate secondDate;
	private String message;

	public DateCalculator() {
		firstDate = new OurDate();

		secondDate = new OurDate();

		System.out.println("Date Calculator - it's all relative");
		System.out.println();
	}

	public void inputDates() {

		System.out.println("Enter first date");
		firstDate.inputYear();
		firstDate.inputMonth();
		firstDate.inputDay();
		System.out.println();

		secondDate = new OurDate();
		System.out.println("Enter second date");
		secondDate.inputYear();
		secondDate.inputMonth();
		secondDate.inputDay();
		System.out.println();
	}

	private void inputDate(OurDate date) {
		secondDate = date;
	}

	public void calculateDifference() {
		int diff = firstDate.calcDays() - secondDate.calcDays();

		String comparisson = "";
		if (diff == 0) {
			comparisson = " the same as ";
		}
		if (diff > 0) {
			comparisson = " later than ";
		}
		if (diff < 0) {
			comparisson = " earlier than ";
			diff *= -1;
		}

		int year = diff / 360;
		int month = (diff % 360) / 30;
		int week = ((diff % 360) % 30) / 7;
		int days = ((diff % 360) % 30) % 7;

		String yearText = "";
		if (year > 0) {
			if (year == 1) {
				yearText = "year";
			}
			if (year > 1) {
				yearText = "years";
			}
		}
		String monthText = "";
		if (month > 0) {
			if (month == 1) {
				monthText = "month";
			}
			if (month > 1) {
				monthText = "months";
			}
		}

		String weekText = "";
		if (week > 0) {
			if (week == 1) {
				weekText = "week";
			}
			if (week > 1) {
				weekText = "weeks";
			}
		}

		String daysText = "";
		if (days > 0) {
			if (days == 1) {
				daysText = "day";
			}
			if (days > 1) {
				daysText = "days";
			}
		}

		String datesText = "";
		if (year > 0) {
			datesText += " " + year + " " + yearText;
			if (month > 0) {
				datesText += " " + month + " " + monthText;
				if (week > 0) {
					datesText += " " + week + " " + weekText;
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				} else {
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				}

			} else {
				if (week > 0) {
					datesText += " " + week + " " + weekText;
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				} else {
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				}
			}
		} else {
			if (month > 0) {
				datesText += month + " " + monthText;
				if (week > 0) {
					datesText += " " + week + " " + weekText;
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				} else {
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				}
			} else {
				if (week > 0) {
					datesText += " " + week + " " + weekText;
					if (days > 0) {
						datesText += " and " + days + " " + daysText;
					}
				} else {
					if (days > 0) {
						datesText += " " + days + " " + daysText;
					}
				}
			}

		}

		message = " is" + datesText + comparisson;
	}

	public void display() {

		firstDate.displayDate();

		System.out.print(message);

		secondDate.displayDate();
	}
}

