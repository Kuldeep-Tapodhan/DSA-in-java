package BasicJava;

import java.util.Scanner;

public class helping {
    static Scanner sc=new Scanner(System.in);
     public  static  void swap(int[] arr,int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }

     public static  void displayarr(int[] arr){
         int n=arr.length;
         for (int i = 0; i <n ; i++) {
             System.out.print(arr[i]+'\t');
         }
     }

     public static int[] inputarray(int size){
         int[] nums = new int[size];
         for (int i = 0; i < size; i++) {
             nums[i] = sc.nextInt();
         }
         return  nums;
     }

}
