package BasicJava.Recursion;

import java.util.Scanner;

public class p_Power_q {


    static  int ppowerq(int n,int q){

           if (q==0){
               return 1;
           }
           return ppowerq(n,q-1)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number:");
        int p= sc.nextInt();
        int q= sc.nextInt();
        System.out.println(ppowerq(p,q));
    }
}
