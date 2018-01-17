package Chapter3;

import java.util.Scanner;

/**
 * Program displays which entered number is bigger or less than the other number
 *
 * @author Dennis Case
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.print("Enter a second number: ");
        num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        }
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        }
        if (num1 == num2) {
            System.out.println("The first number is equal than the second number.");
        }
        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second number.");
        }
        if (num1 >= num2) {
            System.out.println("The first number is greater than or equal to the second number.");
        }
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second number.");
        }
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if ((num1 / num2) < 1) {
            System.out.println("Proper fraction.");
        } else if ((num1 / num2) > 1) {
            System.out.println("Improper fraction.");
        }
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (1 <= num2 && num2 <= 100) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}
