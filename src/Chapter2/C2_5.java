package Chapter2;

import java.util.Scanner;

/**
 * Program displays the gratuity of a payment with the total price
 *
 * @author Dennis Case
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        double gratuity, total, subtotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        subtotal = input.nextDouble();
        System.out.print("Enter the gratuity without percentage sign: ");
        gratuity = input.nextDouble();
        total = subtotal + (gratuity / 10);
        System.out.println("The gratuity is $" + gratuity / 10 + " and the total is $" + total);
    }
}
