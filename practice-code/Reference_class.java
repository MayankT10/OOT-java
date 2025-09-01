import java.util.Scanner; // Simple text scanner 
import java.util.regex.MatchResult; // Interface to determine the match against a regular expression 

public class Reference_class {

    public static void main(String... args) {
        // A string in which we are going to find numbers
        String wordsAndNumbers = """
                Longing rusted furnance
                daybreak 17 benign
                9 benign homecoming 1 
                frieght car
                """;

        try(Scanner scanner = new Scanner(wordsAndNumbers)) {
            // Searches for "benign" in the string wordsAndNumbers and prints the word for how many times it is present in it
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }
    }
    
}
