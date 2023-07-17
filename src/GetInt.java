import java.util.Scanner;

public class GetInt {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int intValue = getInt(pipe, "Enter an integer: ");
        System.out.println("You entered: " + intValue);
        pipe.close();
    }

    public static int getInt(Scanner pipe, String prompt) {
        int value = 0; // Default value
        boolean validInput = false;

        do {
            System.out.print(prompt);

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                validInput = true;
            } else {
                String trash = pipe.next(); // Read and discard non-integer input
                System.out.println("Invalid input. Please enter an integer.");
            }
        } while (!validInput);

        pipe.nextLine(); // Clear the newline character from the input

        return value;
    }
}

