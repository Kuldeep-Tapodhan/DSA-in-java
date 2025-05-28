package BasicJava.Recursion;

import java.util.Scanner;

public class subsetSum {


    static  void  subssetsum(int[] a,int n,int i,int sum ){

        if (i >= n) {
            System.out.println(sum);
            return;
        }
        subssetsum(a,n,i+1,sum+a[i]);
        subssetsum(a,n,i+1,sum);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Element:");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        subssetsum(arr,n,0,0);
    }
}
