import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SSN Pattern: ^\d{3}-\d{2}-\d{4}$
        String ssn = SafeInput.getRegExString(scanner, "Enter your Social Security Number (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your Social Security Number: " + ssn);

        // UC Student M Number Pattern: ^(M|m)\d{5}$
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M Number (M#####): ", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M Number: " + mNumber);

        // Menu Choice Pattern: ^[OoSsVvQq]$
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice (O, S, V, Q): ", "^[OoSsVvQq]$");
        System.out.println("Your Menu Choice: " + menuChoice);

        scanner.close();
    }
}


