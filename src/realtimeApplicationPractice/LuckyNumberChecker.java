package realtimeApplicationPractice;

import java.util.Scanner;

public class LuckyNumberChecker {


    public static boolean isLuckyNumber(int num) {
        int sum = sumOfSquaresEvenPositions(num);
        return sum % 9 == 0;
    }

    public static int sumOfSquaresEvenPositions(int num) {
        String numStr = Integer.toString(num);
        int sum = 0;
        for (int i = 1; i < numStr.length(); i += 2) {
            int digit = numStr.charAt(i) - '0'; // it baiscally convert the assci value of string - '0' which
            sum += digit * digit; // give us its integer vallue eg. for  '7' acci value is 55,55-48(acci value of '0')
                                    // which give us 7 which is integer  hence str converrt to int
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number");
        } else {
            System.out.println(number + " is not a lucky number");
        }
    }


}
