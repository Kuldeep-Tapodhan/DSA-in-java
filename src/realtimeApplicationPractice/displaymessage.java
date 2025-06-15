package realtimeApplicationPractice;/*

Implement a program that displays a message for a given number based on the below conditions.

If the number is a multiple of 3, display "Zip".

If the number is a multiple of 5, display "Zap".

If the number is a multiple of both 3 and 5, display "Zoom",

For all other cases, display "Invalid".

 */


import java.util.Scanner;

public class displaymessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive Number:");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Zoom");
        } else if (number % 3 == 0) {
            System.out.println("Zip");
        } else if (number % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Invalid");
        }
    }
}
