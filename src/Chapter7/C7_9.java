package Chapter7;

import java.util.*;

/**
 * Program to show minimum in array
 *
 * @author Dennis Case
 */
public class C7_9 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

    }

    /**
     * min method finds the array minimum
     *
     * @param array the array the user inputed
     */
    public static void min(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            double currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            System.out.println("The minimum is: " + currentMinIndex);

        }

    }

}
