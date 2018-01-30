package Chapter8;

import java.util.*;

/**
 * Program to simulate sale data
 *
 * @author Dennis Case
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sale = new double[4][5];

        String response;

        do {
            int num1 = 0;
            int num2 = 0;

            System.out.println("Enter the salesman ID as A, B, C, or D: ");
            String employee = input.next();

            switch (employee) {
                case "A":
                    num1 = 0;
                    break;
                case "B":
                    num1 = 1;
                    break;
                case "C":
                    num1 = 2;
                    break;
                case "D":
                    num1 = 3;
                    break;
                default:
                    break;
            }

            System.out.println("Enter the day as M, T, W, H, or F: ");
            employee = input.next();

            switch (employee) {
                case "M":
                    num2 = 0;
                    break;
                case "T":
                    num2 = 1;
                    break;
                case "W":
                    num2 = 2;
                    break;
                case "H":
                    num2 = 3;
                    break;
                case "F":
                    num2 = 4;
                    break;
                default:
                    break;
            }

            System.out.println("Enter the amount of the sale: ");
            double number = input.nextDouble();

            sale[num1][num2] += number;
            System.out.println("More data? Enter Y for more or N to stop.");
            response = input.next().toLowerCase();

        } while (response.equals("y"));

        for (int p = 0; p < 4; ++p) {
            for (int s = 0; s < 5; ++s) {
                System.out.print(sale[p][s]);
            }
            System.out.println();
        }

    }
}
