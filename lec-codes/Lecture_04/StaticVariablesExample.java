// Static Variables can only have one copy of static variable per class, irrespective of how many objects we create

public class StaticVariablesExample {
    
    // Declaring static variables 
    public static String message = "Hello World";

    public static void main(String[] args) {
        System.out.println("Message = " + StaticVariablesExample.message);
    }
}
