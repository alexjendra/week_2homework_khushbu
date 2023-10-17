package homework_week_6;

/**
 *  Declare two instance variables.
 *  Declare one instance method.
 *  Call both instance variables into the instance method inside the print statement.
 *  Declare the Main method.
 *  Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    static int a = 1; // Instance variable 1
    static int b = 2; //Instance variable 2
    String name = "Aarav";
    public void myHomework(){
        Programme1 v1 = new Programme1();//Instance method
        System.out.println(v1.a);
        System.out.println(v1.b);
        System.out.println(v1.name);
    }

    public static void main(String[] args) {
        Programme1 obj = new Programme1();// Main method
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.name);
    }

}

