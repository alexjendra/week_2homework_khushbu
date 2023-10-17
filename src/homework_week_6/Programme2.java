package homework_week_6;

/**
 *  Declare two static variables
 *  Declare one static method
 * Call both static variables into the static method inside the print statement.
 * Declare the Main method.
 * Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    static int a = 40;// static variable 1
    static int b = 50;// Static variable 2
    static String name = "Amazon Prime";
    public static void v1(){
        System.out.println(a);// Static method
        System.out.println(b);
        System.out.println(name);

    }

    public static void main(String[] args) {
        System.out.println(a);// Main method
        System.out.println(b);
        System.out.println(name);


    }
}
