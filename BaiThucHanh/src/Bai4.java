import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("---Menu---");
            System.out.println("1.Fehrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("The temperature in Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter the temperature in Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("The temperature in Fahrenheit is: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0) ;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }
}
