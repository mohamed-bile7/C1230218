package C1230218;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        int vowelCount = countVowelsInText(userInput);
        System.out.println("Total number of vowels are: " + vowelCount);
    }

    public static int countVowelsInText(String text) {
        int vowelCount = 0;
        String lowercaseText = text.toLowerCase();

        for (char character : lowercaseText.toCharArray()) {
            if ("aeiou".indexOf(character) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}