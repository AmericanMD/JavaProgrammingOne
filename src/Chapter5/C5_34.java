package Chapter5;

import java.util.Scanner;

/**
 * Program displays the game rock paper scissors, best of 3 wins.
 *
 * @author Dennis Case
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int per = 0, com = 0;
        int q = 0;
        System.out.println("Welcome to Rock, Paper, Scissors! First to two wins!");
        while (q < 100000) {
            int number = (int) (Math.random() * 3);
            System.out.print("\nEnter 0 for rock, 1 for paper, and 2 for scissors: ");
            int role = input.nextInt();
            if (number == role) {
                System.out.println("It is a draw, you entered " + role + " and the computer entered " + number);
            }
            if (number == 1 && role == 2) {
                System.out.println("The computer is paper. You are scissors. You win!");
                per++;
            }
            if (number == 2 && role == 0) {
                System.out.println("The computer is scissors. You are rock. You win!");
                per++;
            }
            if (number == 0 && role == 1) {
                System.out.println("The computer is rock. You are paper. You win!");
                per++;
            }
            if (number == 1 && role == 0) {
                System.out.println("The computer is paper. You are rock. The computer wins!");
                com++;
            }
            if (number == 2 && role == 1) {
                System.out.println("The computer is scissors. You are paper. The computer wins!");
                com++;
            }
            if (number == 0 && role == 2) {
                System.out.println("The computer is rock. You are scissors. The computer wins!");
                com++;
            }
            if (com == 2) {
                System.out.println("\n\nThe computer won the best of 3, THE COMPUTER WINS!");
                break;
            }
            if (per == 2) {
                System.out.println("\n\nYou won the best of 3, YOU WIN!");
                break;
            }

            q++;
        }
    }
}
