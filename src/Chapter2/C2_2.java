package Chapter2;

import java.util.Scanner;

/**
 * Program will find the area of an object
 *
 * @author Dennis Case
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        double volume, area, length, radius;
        final double PIE = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = input.nextDouble();
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        area = radius * radius * PIE;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
