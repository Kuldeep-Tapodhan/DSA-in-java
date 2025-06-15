package BasicJava.Recursion.recursionONSring;

import java.util.Scanner;

public class ProductOfDigit {

    public static int productofdigit(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * productofdigit(n / 10);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number:");
        int n = sc.nextInt();

        System.out.println(productofdigit(n));
    }
}
