import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favoriteInt);

        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }
}

