import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item ($0.50 - $10.00): ", 0.50, 10.00);
            totalCost += itemPrice;
        } while (SafeInput.getYNConfirm(scanner, "Do you have more items? (Y/N): "));

        System.out.printf("Total Cost: $%.2f%n", totalCost);
        scanner.close();
    }
}

