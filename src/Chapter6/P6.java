package Chapter6;

import java.util.Scanner;

/**
 * Program displays the game rock paper scissors, best of 3 wins.
 *
 * @author Dennis Case
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros does a Dollar buy? ");
        double eu = input.nextDouble();
        System.out.println("How many Pound Sterling does a Dollar buy? ");
        double lb = input.nextDouble();
        System.out.println("How many Yen does a Dollar buy? ");
        double yn = input.nextDouble();
        String s = "";

        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollar = input.nextDouble();
            System.out.println("Enter 'E' to buy Euros, 'P' to buy Pound Sterling, or 'Y' to buy Yen: ");
            String response = input.next();
            calculation(response, dollar, eu, lb, yn);

            do {
                System.out.println("\nAre there more conversions to preform? ");
                s = input.next();
            } while (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no"));

        } while (s.equalsIgnoreCase("yes"));
    }

    /**
     * calculation Method
     *
     * @param random is a string needed only to find the char
     * @param t is needed to set variable dollar to original value
     * @param eu is the value of a Euros.
     * @param lb is the value of Pound Sterling
     * @param yn is the value of a Yens.
     *
     */
    public static void calculation(String random, double t, double eu, double lb, double yn) {
        char w = random.charAt(0);
        double dollar = t;
        if (dollar > 100) {
            dollar = dollar - (dollar * .05);
        }
        if (dollar < 100) {
            dollar = dollar - (dollar * .10);
        }
        if (w == 'e' || w == 'E') {
            double euro = eu * dollar;
            System.out.printf("For $%.2f, you will be able to buy %.2f Euros.", t, euro);
        } else if (w == 'p' || w == 'P') {
            double pound = lb * dollar;
            System.out.printf("For $%.2f, you will be able to buy %.2f Pound Sterlings.", t, pound);
        } else if (w == 'y' || w == 'Y') {
            double yen = yn * dollar;
            System.out.printf("For $%.2f, you will be able to buy %.2f Yens.", t, yen);
        }
    }
}
