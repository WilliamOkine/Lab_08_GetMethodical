import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(scanner, "Enter the birth year (1950-2015): ", 1950, 2015);
        System.out.println("Birth Year: " + birthYear);

        int birthMonth = SafeInput.getRangedInt(scanner, "Enter the birth month (1-12): ", 1, 12);
        System.out.println("Birth Month: " + birthMonth);

        int birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day: ", 1, 31);
        System.out.println("Birth Day: " + birthDay);

        int birthHour = SafeInput.getRangedInt(scanner, "Enter the birth hour (1-24): ", 1, 24);
        System.out.println("Birth Hour: " + birthHour);

        int birthMinute = SafeInput.getRangedInt(scanner, "Enter the birth minute (1-59): ", 1, 59);
        System.out.println("Birth Minute: " + birthMinute);

        scanner.close();
    }


    }

