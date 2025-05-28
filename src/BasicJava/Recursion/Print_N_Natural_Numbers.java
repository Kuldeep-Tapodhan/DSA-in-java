package BasicJava.Recursion;

import java.util.Scanner;

public class Print_N_Natural_Numbers {

    static  void printn(int n){

        //(if condition is aclso know as halting or base case...)
        if(n>1){// this if condtion will alow the recursion to stop when it reach its condtion...
            printn(n-1);
        }
        System.out.print(n+" ");
    }

    static  void  printnto1(int n){
        if(n==1){
            System.out.print(" "+n);
        }
        else {
            System.out.print(" "+n);
            printnto1(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive number:");
        int n=sc.nextInt();
        printn(n);
        System.out.println();
        printnto1(n);
    }
}
