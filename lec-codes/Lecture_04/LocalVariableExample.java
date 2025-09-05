public class LocalVariableExample {
    public static void main(String[] args) {

        // Local variable declared inside main method
        int number = 10;
        System.out.println("Local variable inside main method = " +  number);
        showMessage();
    }
    public static void showMessage() {
        
        // Local variable declared inside showMessage method
        String message = "Hello";
        System.out.println(message);
    }
}
