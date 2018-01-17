package Chapter5;

import java.util.Scanner;

/**
 * Program displays reversed string of what you enter.
 *
 * @author Dennis Case
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int x = s.length() - 1;
        System.out.print("The reversed string is: ");
        for (int t = x; t != -1; t--) {
            System.out.print(s.charAt(t));
        }
    }
}
