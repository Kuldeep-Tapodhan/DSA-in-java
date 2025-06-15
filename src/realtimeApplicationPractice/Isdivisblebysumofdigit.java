package realtimeApplicationPractice;

import java.util.Scanner;

import static BasicJava.Recursion.SumOfDigit.sumofdigit;

public class Isdivisblebysumofdigit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int suofdigit=sumofdigit(n);
        if (n%suofdigit==0){
            System.out.println("Is Divisilbe by sum of digit");
        }
        else System.out.println("Is Not Divisilbe by sum of digit");;
    }
}
