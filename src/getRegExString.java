import java.util.Scanner;

public class getRegExString {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String regExString = getRegExString(pipe, "Enter a string matching the pattern [0-9]+: ", "[0-9]+");
        System.out.println("You entered: " + regExString);
        pipe.close();
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        boolean validInput = false;

        do {
            System.out.print(prompt);

            if (pipe.hasNextLine()) {
                input = pipe.nextLine();
                if (input.matches(regEx)) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a string matching the specified pattern.");
                }
            } else {
                input = pipe.next(); // Read and discard non-line input
                System.out.println("Invalid input. Please enter a string.");
            }
        } while (!validInput);

        return input;
    }
}

