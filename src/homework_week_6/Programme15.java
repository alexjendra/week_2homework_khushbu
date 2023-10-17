package homework_week_6;

/**
 * Write a Java program to swap two variables.
 */

public class Programme15 {
    public static void main(String[] args) {
        // Declare and initialize two variables
        int j = 25;
        int k = 50;

        System.out.println("Before swapping: j = " + j + ", k = " + k);

        // Swap the values of a and b using a temporary variable
        int temp = j;
        j = k;
        k = temp;

        System.out.println("After swapping: j = " + j + ", k = " + k);
    }
}


