package Chapter4;

import java.util.Scanner;

/**
 * Program displays employee's name and how much they get payed based on hours
 * worked plus hourly pay minus taxes
 *
 * @author Dennis Case
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double ftw = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double stw = input.nextDouble();
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: $" + payrate);
        System.out.printf("Gross pay: $%.2f", (payrate * hours));
        System.out.println("\n\nDeductions:");
        System.out.printf("\t Federal Witholding (%.2f): $%.2f", (ftw * 100), (ftw * payrate * hours));
        System.out.printf("\n\t State Witholding (%.2f): $%.2f", (stw * 100), (stw * payrate * hours));
        System.out.printf("\n\t Total Deductions: $%.2f", ((ftw * (payrate * hours)) + (stw * payrate * hours)));
        System.out.printf("\nNet Pay: $%.2f", ((payrate * hours) - ((ftw * payrate * hours) + (stw * payrate * hours))));
    }

}
