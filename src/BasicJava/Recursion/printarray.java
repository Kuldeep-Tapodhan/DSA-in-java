package BasicJava.Recursion;

import java.util.Scanner;

public class printarray {

static void printarray(int[] arr,int i){

    if (i==arr.length) {
        return;
    }
    System.out.print(arr[i]+" ");
    printarray(arr,i+1);
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the array:");
        int num1= sc.nextInt();
        int[] arr= new int[num1];
        for (int i = 0; i <num1; i++) {
            arr[i]=sc.nextInt();
        }

        printarray(arr,0);
        
    }
}
