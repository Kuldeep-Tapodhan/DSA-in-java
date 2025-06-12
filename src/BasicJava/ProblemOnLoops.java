package BasicJava;

import java.util.Scanner;

public class ProblemOnLoops {

    // Function to count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Function to calculate the sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        return sum;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    // Function for the series where odd numbers are added and even numbers are subtracted
    public static int seriesSum(int num) {
        int seriesAnswer = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                seriesAnswer += i;
            } else {
                seriesAnswer -= i;
            }
        }
        return seriesAnswer;
    }

    // Function to calculate Factorial
    public static int factorial(int num) {
        int fac = 1;
        int i = 1;
        while (i <= num) {
            fac *= i;
            i++;
        }
        return fac;
    }

    // Function to calculate power (a^b)
    public static int power(int a, int b) {
        int power = 1;
        while (b > 0) {
            power *= a;
            b--;
        }
        return power;
    }

    // Main method to call the functions and display results
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number-related operations
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Display results of various functions
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumOfDigits(num));
        System.out.println("Reversed number: " + reverseNumber(num));
        System.out.println("Series result: " + seriesSum(num));
        System.out.println("Factorial: " + factorial(num));

        // Input for power calculation
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();
        System.out.println("Result of " + a + "^" + b + ": " + power(a, b));

        sc.close();
    }
}
