package Chapter4;

import java.util.Scanner;

/**
 * Program displays bidder info on trying to compete to get a job done for the
 * best price
 *
 * @author Dennis Case
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The details asked for below concern the first bidder");
        System.out.print("Enter you name: ");
        String b1 = input.next();
        System.out.print("How many hours of work will you require? ");
        int b1hours = input.nextInt();
        System.out.print("How much do you charge per hour? ");
        double b1charge = input.nextDouble();
        double b1cost = b1hours * b1charge;
        System.out.println("\nThe details asked for below concern the second bidder");
        System.out.print("Enter you name: ");
        String b2 = input.next();
        System.out.print("How many hours of work will you require? ");
        int b2hours = input.nextInt();
        System.out.print("How much do you charge per hour? ");
        double b2charge = input.nextDouble();
        double b2cost = b2hours * b2charge;
        if (b1cost < b2cost) {
            System.out.println("\nThe winner is " + b1);
            System.out.printf("\nThe total cost is %.2f", b1cost);
        } else if (b1cost > b2cost) {
            System.out.println("\nThe winner is " + b2);
            System.out.printf("\nThe total cost is %.2f", b2cost);
        } else if (b1cost == b2cost && b1hours < b2hours) {
            System.out.println("\nThe winner is " + b1);
            System.out.printf("The total cost is %.2f", b1cost);
            System.out.println("\nThe number of hours is " + b1hours);
        } else if (b1cost == b2cost && b1hours > b2hours) {
            System.out.println("\nThe winner is " + b2);
            System.out.printf("The total cost is %.2f", b2cost);
            System.out.println("\nThe number of hours is " + b2hours);
        } else if (b1cost == b2cost && b1hours == b2hours) {
            System.out.println("\nBoth " + b1 + " and " + b2 + " have identical bids.");
            System.out.println("Number of hours:");
            System.out.printf("First bidder = %d\t Second bidder = %d", b1hours, b2hours);
            System.out.println("\nCost per hour:");
            System.out.println("First bidder = $" + b1charge + "\t Second biddr = $" + b2charge);
            System.out.println("Total Cost:");
            System.out.println("First bidder = $" + b1cost + "\t Second bidder = $" + b2cost);
        }
    }
}
