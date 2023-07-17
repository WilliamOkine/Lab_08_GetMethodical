import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = getNonEmptyString(pipe, "Enter your first name");
        lastName = getNonEmptyString(pipe, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }

    //GetNonEmptyString
    public static String getNonEmptyString(Scanner scanner, String message) {
        String input = "";
        do {
            System.out.println(message);
            input = scanner.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }
}