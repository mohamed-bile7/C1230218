package C1230218;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int baseNumber = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        int result = calculatePower(baseNumber, exponent);
        System.out.println(baseNumber + " raised to the power of " + exponent + " is: " + result);
    }

    public static int calculatePower(int base, int exponent) {
        int powerResult = 1;

        for (int i = 0; i < exponent; i++) {
            powerResult *= base;
        }

        return powerResult;
    }
}

