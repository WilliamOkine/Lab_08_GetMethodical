import java.util.Scanner;

public class getRangedDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rangedDouble = getRangedDouble(scanner, "Enter a double value within the range [0.0 - 1.0]: ", 0.0, 1.0);
        System.out.println("You entered: " + rangedDouble);
        scanner.close();
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0.0; // Default value
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                if (value >= low && value <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a double value within the specified range.");
                }
            } else {
                String trash = pipe.next(); // Read and discard non-double input
                System.out.println("Invalid input. Please enter a double value.");
            }
        } while (!validInput);

        pipe.nextLine(); // Clear the newline character from the input

        return value;
    }
}

