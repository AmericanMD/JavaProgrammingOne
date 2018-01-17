package Chapter4;

import java.util.Scanner;

/**
 * Program displays whether or not the second string is a substring of the first
 * string
 *
 * @author Dennis Case
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string S1: ");
        String s1 = input.next();
        System.out.println("Enter string S2: ");
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }

}
