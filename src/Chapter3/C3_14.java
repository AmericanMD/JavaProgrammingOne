package Chapter3;

import java.util.Scanner;

/**
 * Program displays if coin is heads or tails and takes user input for guess
 *
 * @author Dennis Case
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int) (Math.random() * 2);
        System.out.print("Enter 0 or 1 to guess if the coin is heads or tails: ");
        int guess = input.nextInt();
        if (x == 0 && guess == 0) {
            System.out.println("You entered heads and the coin is heads.");
        }
        if (x == 0 && guess == 1) {
            System.out.println("You entered tails and the coin is heads.");
        }
        if (x == 1 && guess == 0) {
            System.out.println("You entered heads and the coin is tails.");
        }
        if (x == 1 && guess == 1) {
            System.out.println("You entered tails and the coin is tails.");
        }
    }
}
