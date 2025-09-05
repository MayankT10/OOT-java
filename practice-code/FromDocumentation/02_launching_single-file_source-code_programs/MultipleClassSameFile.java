public class MultipleClassSameFile {
    public static void main(String[] args) {
        System.out.println(GenerateMessage.generatemessage());
        System.out.println(AnotherMessage.generateAnothermessage());
    }
}

class GenerateMessage {
    static String generatemessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnothermessage() {
        return "Here is another message";
    }
}
