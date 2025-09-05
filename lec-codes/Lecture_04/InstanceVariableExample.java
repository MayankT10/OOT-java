public class InstanceVariableExample {

    // Instance Variable ( Declared inside the class but outside any message ) 
    public String message;

    public InstanceVariableExample (String greeting) {
        message = greeting;
    }

    // Method to print
    public void printData() {
        System.out.println("Message = " + message );
    }

    public static void main(String[] args) {

        // Creating an object to access Instance Variables
        InstanceVariableExample message1 = new InstanceVariableExample("Good Morning");
        InstanceVariableExample message2 = new InstanceVariableExample("Good Afternoon");
        InstanceVariableExample message3 = new InstanceVariableExample("Good Night");

        // Accessing instance variable inside the display method
        // Printing it
        // Using System.out.println for each message
        System.out.println("Accessing instance variable = " + message1.message);
        System.out.println("Accessing instance variable = " + message2.message);
        System.out.println("Accessing instance variable = " + message3.message);
        
        // Using printData method to print each method
        message1.printData();
        message2.printData();
        message3.printData();

    }
}
