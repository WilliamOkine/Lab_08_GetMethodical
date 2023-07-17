public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        System.out.println("------------------");

        for (int celsius = -100; celsius <= 100D; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%d\t%.1f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

