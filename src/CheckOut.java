import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            double itemPrice = getRangedDouble(scanner, "Enter the price of the item ($0.50 - $10.00): ", 0.50, 10.00);
            totalCost += itemPrice;
        } while (getYNConfirm(scanner, "Do you have more items? (Y/N): "));

        System.out.printf("Total Cost: $%.2f%n", totalCost);
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

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean confirmed = false;
        boolean validInput = false;

        do {
            System.out.print(prompt);
            String input = pipe.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                confirmed = true;
                validInput = true;
            } else if (input.equals("n") || input.equals("no")) {
                confirmed = false;
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!validInput);

        return confirmed;
    }
}
