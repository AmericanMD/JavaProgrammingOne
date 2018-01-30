package Chapter8;

import java.util.Arrays;

/**
 * Program to find out the sales man's sales
 *
 * @author Dennis Case
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String[] dList = {"S", "M", "T", "W", "T", "F", "S", "Total"};
        int[][] aList = {
            {2, 4, 3, 4, 5, 8, 8, 34},
            {7, 3, 4, 3, 3, 4, 4, 28},
            {3, 3, 4, 3, 3, 2, 2, 20},
            {9, 3, 4, 7, 3, 4, 1, 31},
            {3, 5, 4, 3, 6, 3, 8, 32},
            {3, 4, 4, 6, 3, 4, 4, 28},
            {3, 7, 4, 8, 3, 8, 4, 37},
            {6, 3, 5, 9, 2, 7, 9, 41}
        };
        System.out.println("   ");
        System.out.print("          ");
        for (int i = 0; i < dList.length; i++) {
            System.out.print("    " + dList[i]);
        }
        System.out.println();
        for (int i = 0; i < aList.length; i++) {
            System.out.print("Employee " + i);
            for (int w = 0; w < aList[i].length; w++) {
                System.out.print("    " + aList[i][w]);
            }
            System.out.println();
        }

    }
}
