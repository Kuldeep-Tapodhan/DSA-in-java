package Strings;

import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to toggle case: ");
        String input = scanner.nextLine();

        String toggled = toggleCase(input);
        System.out.println("Toggled case: " + toggled);
    }
}
