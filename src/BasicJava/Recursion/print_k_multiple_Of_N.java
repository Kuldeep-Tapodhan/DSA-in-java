package BasicJava.Recursion;

import java.util.Scanner;

public class print_k_multiple_Of_N {
    static void printkmofn(int n,int k){

        if(k==1){
            System.out.print(n+" ");
          return ;

        } else if (k>1) {
            printkmofn(n,k-1);
            System.out.print(" "+n*k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive Number:");
        int n= sc.nextInt();
        int k= sc.nextInt();

        printkmofn(n,k);
    }
}
