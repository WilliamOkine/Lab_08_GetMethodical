public class PrettyHeader {
    public static void main(String[] args) {
        prettyHeader("William Okine");
    }

    public static void prettyHeader(String msg) {
        int headerWidth = 60;
        int msgLength = msg.length();
        int spaceLength = (headerWidth - msgLength - 6) / 2;


        for (int i = 0; i < headerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("***");
        for (int i = 0; i < spaceLength; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spaceLength; i++) {
            System.out.print(" ");
        }

        if (msgLength % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");


        for (int i = 0; i < headerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
