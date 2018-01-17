package Chapter1;

/**
 * Program displays perimeter of a circle and the area of the circle
 *
 * @author Dennis Case
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5, perimeter = 0, area = 0;
        perimeter = 2 * radius * 3.14;
        area = radius * radius * 3.14;
        System.out.println("The perimeter of the circle is " + perimeter);
        System.out.println("The area of the circle is " + area);
    }

}
