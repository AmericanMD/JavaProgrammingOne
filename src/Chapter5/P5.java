package Chapter5;

import java.util.Scanner;

/**
 * Program displays number of yes, no, and invalid entries entered
 *
 * @author Dennis Case
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tv = 0, y = 0, n = 0, iv = 0;
        for (int t = 0; t < 100000; t++) {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, and 'Q' to quit voting: ");
            String s = input.nextLine();

            if (s.length() > 1) {
                System.out.print("INVALID CODE: ");
                iv = ++iv;
            }
            char c = s.charAt(0);
            if (c != 'Y' && c != 'y' && c != 'N' && c != 'n' && c != 'Q' && c != 'q') {
                System.out.print("INVALID CODE: ");
                iv = iv + 1;
            }
            if (c == 'Y' || c == 'y') {
                y = ++y;
            }
            if (c == 'N' || c == 'n') {
                n = ++n;
            }
            if (c == 'Q' || c == 'q') {
                tv = iv + y + n;
                System.out.println("\n\n\nYes votes:     " + y + "\nNo votes:      " + n + "\nInvalid votes: " + iv + "\nTotal votes:   " + tv);
                break;
            }
        }
    }
}
