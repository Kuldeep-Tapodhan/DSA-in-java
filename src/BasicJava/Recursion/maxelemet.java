package BasicJava.Recursion;

import java.util.Scanner;

public class maxelemet {

    static int printmaxarray(int[] arr, int i){

        if (i==arr.length-1) {
            return arr[i];
        }

        int val =printmaxarray(arr,i+1);

        return Math.max(arr[i],val);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the array:");
        int num1= sc.nextInt();
        int[] arr= new int[num1];
        for (int i = 0; i <num1; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(printmaxarray(arr,0));


    }
}
