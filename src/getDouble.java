import java.util.Scanner;

public class getDouble {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double doubleValue = getDouble(pipe, "Enter a double value: ");
        System.out.println("You entered: " + doubleValue);
        pipe.close();
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt);

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                validInput = true;
            } else {
                String trash = pipe.next();
                System.out.println("Invalid input. Please enter a double value.");
            }
        } while (!validInput);

        pipe.nextLine();

        return value;
    }
}


