package C1230218;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitTemperature = scanner.nextDouble();

        double celsiusTemperature = convertToCelsius(fahrenheitTemperature);
        System.out.println("Temperature in Celsius: " + celsiusTemperature);
    }

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
