package Chapter2;

import java.util.Scanner;

/**
 * Program displays amount due for the ordered meal plus tip
 *
 * @author Dennis Case
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        double meal, drink, dessert, subtotal, saletax, tiptax, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of your meal: ");
        meal = input.nextDouble();
        System.out.println("Enter the price of your drink: ");
        drink = input.nextDouble();
        System.out.println("Enter the price of your dessert: ");
        dessert = input.nextDouble();
        subtotal = meal + drink + dessert;
        saletax = subtotal * .1;
        tiptax = (subtotal + saletax) * .15;
        total = tiptax + subtotal + saletax;
        System.out.println("Your total is $" + total + ", $" + tiptax + "for the tip, $" + saletax + " for the sales tax, and $" + subtotal + " for your meal.");

    }
}

