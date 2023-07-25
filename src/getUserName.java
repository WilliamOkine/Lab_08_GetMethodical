import java.util.Scanner;

    public class getUserName {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            String userName = SafeInput.getNonZeroLenStr(myScanner, "Enter user name");
            System.out.println("User name entered: " + userName);
        }
    }


