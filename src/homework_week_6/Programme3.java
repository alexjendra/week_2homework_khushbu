package homework_week_6;

/**
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme
 */
public class Programme3 {
    int c = 5; //Instance variable
    static String name = "Ram"; //Static variable
    //Instance method
    public void myMethod() {
        Programme3 a1 = new Programme3();
        System.out.println(a1.c);
    }
    //Static method
    public static void b2(){
        Programme3 b2 = new Programme3();
        System.out.println(b2.name);

    }
   //Main method
    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        System.out.println(obj.c);
        System.out.println(name);


    }
}
