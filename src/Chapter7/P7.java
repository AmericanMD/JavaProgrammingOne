package Chapter7;

import java.util.*;

/**
 * Program displays the number of values wanted in the list and gives the
 * average of the values while also displaying the array.
 *
 * @author Dennis Case
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want in your list?");
        int arraySize = input.nextInt();
        double aList[] = new double[arraySize];
        method1(arraySize, aList, input);
        System.out.println(Arrays.toString(aList));
        average(aList);
    }

    /**
     * method1 Method
     *
     * @param arraySize is the size of the array.
     * @param aList is the array parameters.
     * @param input is the keyword used to take user input.
     *
     * @return aList returns the inputted value in the the new chart system.
     */
    public static double[] method1(int arraySize, double aList[], Scanner input) {
        for (int i = 0; i < arraySize; i++) {
            aList[i] = input.nextDouble();
        }
        return aList;
    }

    /**
     * average Method
     *
     * @param aList pulls the list values and finds the average of them.
     */
    public static void average(double[] aList) {
        double y = 0;
        for (double x : aList) {
            y += x;
        }
        System.out.println("Average is: " + y / aList.length);
    }
}
