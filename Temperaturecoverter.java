import java.util.Scanner;

public class Temperaturecoverter {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("-------------------------------");
        System.out.println("Choose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double convertedTemperature = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, convertedTemperature);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double convertedTemperature = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
