import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getRangedInt(scanner, "Enter the birth year (1950-2015): ", 1950, 2015);
        System.out.println("Birth Year: " + birthYear);

        int birthMonth = getRangedInt(scanner, "Enter the birth month (1-12): ", 1, 12);
        System.out.println("Birth Month: " + birthMonth);

        int birthDay = getBirthDay(scanner, birthMonth);
        System.out.println("Birth Day: " + birthDay);

        int birthHour = getRangedInt(scanner, "Enter the birth hour (1-24): ", 1, 24);
        System.out.println("Birth Hour: " + birthHour);

        int birthMinute = getRangedInt(scanner, "Enter the birth minute (1-59): ", 1, 59);
        System.out.println("Birth Minute: " + birthMinute);

        scanner.close();
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0; // Default value
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                if (value >= low && value <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer within the specified range.");
                }
            } else {
                String trash = pipe.next(); // Read and discard non-integer input
                System.out.println("Invalid input. Please enter an integer value.");
            }
        } while (!validInput);

        pipe.nextLine(); // Clear the newline character from the input

        return value;
    }

    public static int getBirthDay(Scanner scanner, int birthMonth) {
        int birthDay;
        boolean validInput = false;

        switch (birthMonth) {
            case 2:
                birthDay = getRangedInt(scanner, "Enter the birth day (1-29): ", 1, 29);
                validInput = true;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = getRangedInt(scanner, "Enter the birth day (1-30): ", 1, 30);
                validInput = true;
                break;
            default:
                birthDay = getRangedInt(scanner, "Enter the birth day (1-31): ", 1, 31);
                validInput = true;
                break;
        }

        return birthDay;
    }
}

