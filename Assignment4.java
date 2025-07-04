package C1230218;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers in reverse order:");
        for (int i = Numbers.length - 1; i >= 0; i--) {
            System.out.print(Numbers[i] + " ");
        }
    }
}

