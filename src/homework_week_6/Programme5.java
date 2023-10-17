package homework_week_6;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods
 */

public class Programme5 {
    double num1;
    double num2;

    public Programme5(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String add() {
        return String.format("%f + %f = %f", num1, num2, num1 + num2);
    }

    public String subtract() {
        return String.format("%f - %f = %f", num1, num2, num1 - num2);
    }

    public String multiply() {
        return String.format("%f * %f = %f", num1, num2, num1 * num2);
    }

    public String divide() {
        return String.format("%f / %f = %f", num1, num2, num1 / num2);
    }

    public static String addStatic(double num1, double num2) {
        return String.format("%f + %f = %f", num1, num2, num1 + num2);
    }

    public static String subtractStatic(double num1, double num2) {
        return String.format("%f - %f = %f", num1, num2, num1 - num2);
    }

    public static void main(String[] args) {
        Programme5 calculator = new Programme5(40, 20);

        // Instance methods:
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

        // Static methods:
        System.out.println(Programme5.addStatic(20, 40));
        System.out.println(Programme5.subtractStatic(40, 20));
    }
}
