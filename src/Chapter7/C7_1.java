package Chapter7;

import java.util.Scanner;

/**
 * Program displays the grade for students and if they got an A or below based
 * on the given input
 *
 * @author Dennis Case
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = 0;
        double best = 0;
        System.out.println("Enter the number of students: ");
        students = input.nextInt();
        double testScores[] = new double[students];
        String letterGrade[] = new String[students];
        System.out.println("Enter " + students + " scores: ");
        for (int t = 0; t < testScores.length; t++) {
            testScores[t] = input.nextInt();
        }
        for (int t = 0; t < testScores.length; t++) {
            if (best < testScores[t]) {
                best = testScores[t];
            }
        }
        for (int t = 0; t < testScores.length; t++) {
            if (testScores[t] >= (best - 10)) {
                letterGrade[t] = "A";
            } else if (testScores[t] >= (best - 20)) {
                letterGrade[t] = "B";
            } else if (testScores[t] >= (best - 30)) {
                letterGrade[t] = "C";
            } else if (testScores[t] >= (best - 40)) {
                letterGrade[t] = "D";
            } else {
                letterGrade[t] = "F";
            }
        }
        for (int t = 0; t < testScores.length; t++) {
            System.out.println("Student" + (t + 1) + " score is " + testScores[t] + " and grade is " + letterGrade[t]);
        }
    }
}
