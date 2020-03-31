import java.util.Scanner;

public class FibonacciNumbers {
  private int a;
  private int b;
  private int numberofNumbers;
  private int[] fbNumbers;

  public FibonacciNumbers() {
    this.a = 1;
    this.b = 1;
  }

  public void getNumberFromUser() {
    int choice = 0;
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("How many Fibonacci numbers do you want?");
      choice = input.nextInt();

      if (choice < 2) {
        System.out.println("You need to generate at least two");
      }

    } while (choice < 2);

    this.numberofNumbers = choice;
    this.fbNumbers = new int[choice];
    this.fbNumbers[0] = this.a;
    this.fbNumbers[1] = this.b;
  }

  private int nextNumber() {
    int temp = this.b;
    this.b += this.a;
    this.a = temp;
    return this.b;
  }

  private void createFibonacciNumbers() {
    for (int i = 2; i < this.numberofNumbers; i++) {
      this.fbNumbers[i] = nextNumber();
    }

    /*
    //while
    int index = 2;
    while ( index < this.numberofNumbers) {
      this.fbNumbers[index] = nextNumber();
      index++;
    }

    // do-while
    int index = 2;
    if (index <= this.numberofNumbers) {
      return;
    }

    do {
      this.fbNumbers[index] = nextNumber();
      index++;
    } while (index < this.numberofNumbers);
    */
  }


  public void printFibonacciNumbers() {
    System.out.println();
    System.out.printf("The first %d Fibonacci numbers in reverse order are:\n", this.numberofNumbers);

    for (int i = this.numberofNumbers - 1; i >= 0 ;i--) {
      System.out.println(this.fbNumbers[i]);
    }

    /*
    //while
    int index = this.numberofNumbers - 1;
    while (index >= 0) {
      System.out.println(this.fbNumbers[i]);
      index--;
    }

    // do-while
    int index = this.numberofNumbers - 1;
    do {
      System.out.println(this.fbNumbers[i]);
      index--;
    } while (index >= 0);
    */
  }
}


public class Lab7 {
  public static void main(String args[]) {
    System.out.println("Program developed by Andressa Pessoa");

    FibonacciNumbers fibo = new FibonacciNumbers();
    fibo.getNumberFromUser();
    fibo.createFibonacciNumbers();
    fibo.printFibonacciNumbers();
  }
}