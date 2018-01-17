package Chapter3;

import java.util.Scanner;

/**
 * Program displays which shipping deal is better based on weight and price of
 * the package
 *
 * @author Dennis Case
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //People enter a number for the weight and price of each package
        System.out.print("Enter the weight of the Package 1: ");
        double weight1 = input.nextDouble();
        System.out.print("Enter the price of the Package 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight of the Package 2: ");
        double weight2 = input.nextDouble();
        System.out.print("Enter the price of the Package 2: ");
        double price2 = input.nextDouble();
        //This part is to see which deal is better
        double deal1 = price1 / weight1;
        double deal2 = price2 / weight2;
        if (deal1 < deal2) {
            System.out.println("Package 1 has a better price.");
        } else if (deal1 > deal2) {
            System.out.println("Package 2 has a better price.");
        } else if (deal1 == deal2) {
            System.out.println("Package 1 and Package 2 have the same price.");
        }
    }
}
