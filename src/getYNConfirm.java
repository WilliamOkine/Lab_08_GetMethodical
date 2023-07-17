import java.util.Scanner;

    public class getYNConfirm {
        public static void main(String[] args) {
            Scanner pipe = new Scanner(System.in);
            boolean confirmed = getYNConfirm(pipe, "Are you sure? (Y/N): ");
            System.out.println("Confirmed: " + confirmed);
            pipe.close();
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


