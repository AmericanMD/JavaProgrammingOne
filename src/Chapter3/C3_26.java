package Chapter3;

import java.util.Scanner;

/**
 * Program displays if an entered number is divisible by 5 or 6 or both
 *
 * @author Dennis Case
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //People enter a number to see if it is divisible by 5 or 6
        System.out.print("Enter a number: ");
        double number1 = input.nextDouble();
        if (number1 % 5 == 0 && number1 % 6 == 0) {
            System.out.println("Is " + number1 + " divisible by 5 and 6? True");
        } else {
            System.out.println("Is " + number1 + " divisible by 5 and 6? False");
        }
        if (number1 % 5 == 0 || number1 % 6 == 0) {
            System.out.println("Is " + number1 + " divisible by 5 or 6? True");
        } else {
            System.out.println("Is " + number1 + " divisible by 5 or 6? False");
        }
        if (number1 % 5 == 0 ^ number1 % 6 == 0) {
            System.out.println("Is" + number1 + " divisible by 5 or 6, but not both? True");
        } else {
            System.out.println("Is " + number1 + " divisible by 5 or 6, but not both? False");
        }
    }
}
