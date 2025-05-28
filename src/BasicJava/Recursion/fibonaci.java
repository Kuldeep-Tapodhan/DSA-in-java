package BasicJava.Recursion;

import java.util.Scanner;

public class fibonaci {

static  int fibo(int n){
    if(n==1||n==0){
        return n;
    }

    return fibo(n-1)+fibo(n-2);



}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number:");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
}
