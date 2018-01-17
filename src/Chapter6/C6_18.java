package Chapter6;

import java.util.Scanner;

/**
 * Program displays the game rock paper scissors, best of 3 wins.
 *
 * @author Dennis Case
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int k = 0; k < 10000; k++) {
            System.out.print("\nEnter your password: ");
            String password = input.nextLine();
            boolean z = isValid(password);
            if (z != true) {
                System.out.println("Invalid Password");
            } else {
                System.out.println("Valid Password");
                break;
            }
        }
    }

    /**
     * isValid Method
     *
     * @param p arguments from command line prompt
     *
     * @return boolean value back to main method
     */
    public static boolean isValid(String p) {
        int counter = 0;
        if (p.length() < 8) {
            return false;
        }
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i))) {
                return false;
            }
        }
        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }
        return true;
    }
}

