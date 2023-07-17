import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = getInt(scanner, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favoriteInt);

        double favoriteDouble = getDouble(scanner, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }

    public static int getInt(Scanner pipe, String prompt) {
        System.out.print(prompt);
        while (!pipe.hasNextInt()) {
            String trash = pipe.next(); // Read and discard invalid input
            System.out.print("Invalid input. Please enter an integer: ");
        }
        int value = pipe.nextInt();
        pipe.nextLine(); // Clear the newline character from the input pipe
        return value;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        System.out.print(prompt);
        while (!pipe.hasNextDouble()) {
            String trash = pipe.next(); // Read and discard invalid input
            System.out.print("Invalid input. Please enter a double value: ");
        }
        double value = pipe.nextDouble();
        pipe.nextLine(); // Clear the newline character from the input pipe
        return value;
    }
}

