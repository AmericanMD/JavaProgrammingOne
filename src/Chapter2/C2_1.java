package Chapter2;

import java.util.Scanner;

/**
 * Program will convert Celsius to Fahrenheit
 *
 * @author Dennis Case
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        double celsius = 0, fahrenheit = 0;
        System.out.println("Enter the temperature in terms of Celsius to convert it to Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The temperature in Celsius is " + celsius + " which equals " + fahrenheit + " degrees Fahrenheit.");
    }

}
