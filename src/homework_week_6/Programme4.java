package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {
    int a = 90; // instance variable
    String name = "Ram"; // instance variable
    static String lastname = "Shyam"; // static variable
    static int b = 45; // static variable

    public void s1() {
        Programme4 o1 = new Programme4();
        System.out.println(Programme4.lastname);
        System.out.println(Programme4.b);
        System.out.println(a);
        System.out.println(name);

    }

    public static void t2() {
        Programme4 c1 = new Programme4();
        c1.s1();
        System.out.println(c1.a);
        System.out.println(c1.name);
        System.out.println(lastname);
        System.out.println(b);

    }

    public static void main(String[] args) {
        t2();

    }
}