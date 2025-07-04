package C1230218;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = new int[6];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 6 integers:");

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = scanner.nextInt();

            if (Numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
