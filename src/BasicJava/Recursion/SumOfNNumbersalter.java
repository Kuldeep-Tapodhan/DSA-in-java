package BasicJava.Recursion;

import java.util.Scanner;

public class SumOfNNumbersalter {

    static int sumofn(int n){

        if (n ==0) {
            return 0;
        }
        return  sumofn(n-1)+n;
    }
   static int sumofnsign(int n){

        if (n ==0) {
            return 0;
        }
       if (n%2==0) {
            return sumofnsign(n-1)-n;
       }
       else {
           return sumofnsign(n-1)+n;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number:");
        int n= sc.nextInt();
        System.out.print("Postive sum of N Natural Number is:");
        System.out.println(sumofn(n));
        System.out.print("Sum of Natural number with alter sign:");
        System.out.print(sumofnsign(n));

    }
}
