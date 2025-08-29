package BasicJava;

import java.util.Arrays;

public class MergeTwoarray {


    public  static int[] mergearray(int[] arr1, int[] arr2){
        int[] result=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length+arr2.length; i++) {
            if (i<arr1.length){
                result[i]=arr1[i];
            }
            else {
                result[i]=arr2[i-arr1.length];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = mergearray(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}
