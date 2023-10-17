package homework_week_6;
import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */


public class Programme8Triangle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        System.out.println("Enter the base of the triangle : ");
        double height = scanner.nextDouble();
        System.out.println("Enter the height of the triangle");
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
