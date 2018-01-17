package Chapter4;

import java.util.Scanner;

/**
 * Code will display year and profession of college students
 *
 * @author Dennis Case
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String response = input.next().toUpperCase();
        char r0 = response.charAt(0);
        char r1 = response.charAt(1);
        if ((r0 == 'M' || r0 == 'C' || r0 == 'I') && (r1 == '1' || r1 == '2' || r1 == '3' || r1 == '4')) {
            switch (r0) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Information Technology ");
                    break;
                default:
                    break;
            }
            switch (r1) {
                case '1':
                    System.out.print("Freshman");
                    break;
                case '2':
                    System.out.print("Sophomore");
                    break;
                case '3':
                    System.out.print("Junior");
                    break;
                case '4':
                    System.out.print("Senior");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }

}
