package realtimeApplicationPractice;

import java.util.Scanner;

import static BasicJava.Recursion.recursionONSring.ProductOfDigit.productofdigit;

public class SeedNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int productofD= productofdigit(n);
        int seedoffirst=n*productofD;
        if (seedoffirst==m){
            System.out.println("Number is seed of another:");

        }
        else {
            System.out.println("Number is  not seed of another:");
        }
    }
}
