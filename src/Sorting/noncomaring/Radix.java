package Sorting.noncomaring;

import static BasicJava.helping.displayarr;
import static BasicJava.helping.max;

public class Radix {
    public  static void countsort(int[] arr,int place){
        int n=arr.length;
        int[] counter = new int[10];
        int[] ans = new int[n];


        // i am getting freq here
        for (int i = 0; i <arr.length ; i++) {
            counter[(arr[i]/place%10)]++;
        }

        // get prefix sum
        for (int i = 1; i <counter.length ; i++) {
            counter[i]+=counter[i-1];
        }

        // now fill the element accordingly

        for (int i = n-1; i >=0 ; i--) {
            int index=counter[(arr[i]/place)%10] - 1;
            ans[index]=arr[i];
            counter[(arr[i]/place%10)]--;
        }

        for (int i = 0; i <n ; i++) {
            arr[i]=ans[i];
        }
    }


    public static void  radixsort(int[] arr){

        int max=max(arr);

        for (int i = 1; max/i>0; i*=10) {
            countsort(arr,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 45, 123, 3, 89, 56, 1, 200, 34, 9};
        radixsort(arr);
        displayarr(arr);
    }
}
