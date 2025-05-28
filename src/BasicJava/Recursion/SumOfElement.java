package BasicJava.Recursion;

import java.util.Scanner;

public class SumOfElement {

static  int sumoflement(int[] arr,int i){
    if (i==arr.length){
        return 0;
    }
    int sum=sumoflement(arr,i+1);
    return  sum + arr[i];
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the array:");
        int num1 = sc.nextInt();
        int[] arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumoflement(arr,0));

    }
}
