package Sorting.noncomaring;

import static BasicJava.helping.displayarr;
import static BasicJava.helping.max;


/***
 Counting Sort is an efficient, non-comparison-based sorting algorithm for sorting integers within a known, small range.

 Steps
 Find the maximum value in the input array.

 Create a counting array of size (maximum value + 1), initialized to zero.

 Count the occurrences of each element in the input array and store them in the counting array.

 Compute cumulative counts (prefix sums) in the counting array.

 Build the output array by placing each element at its correct sorted position using the counting array.

 Copy the sorted output back into the original array (if required).

 Suitable for:

 Sorting non-negative integers with a small range.

 Time Complexity:

 O(n + k), where n = number of elements, k = range of input values.

 ***/
public class Count {






    public static  void simplecountsort(int[] arr){
        int largest=max(arr);
        int[] countarr= new int[largest+1];
        for (int i = 0; i <arr.length ; i++) {
            countarr[arr[i]]++;
        }
        int k=0;
        for (int i = 0; i <countarr.length ; i++) {
            for (int j = 0; j <countarr[i] ; j++) {
                arr[k++]=i;
            }
        }
    }

    public  static void countsort(int[] arr){
        int n=arr.length;
        int max=max(arr);
        int[] counter = new int[max+1];
        int[] ans = new int[n];


        // i am getting freq here
        for (int i = 0; i <arr.length ; i++) {
            counter[arr[i]]++;
        }

        // get prefix sum
        for (int i = 1; i <counter.length ; i++) {
            counter[i]+=counter[i-1];
        }

        // now fill the element accordingly

        for (int i = n-1; i >=0 ; i--) {
            int index=counter[arr[i]]-1;
            ans[index]=arr[i];
            counter[arr[i]]--;
        }

        for (int i = 0; i <n ; i++) {
            arr[i]=ans[i];
        }
    }



    public static void main(String[] args) {
        int[] arr={4, 2, 9, 2, 10, 3, 7, 4, 1, 0, 6, 10, 5, 2};
        simplecountsort(arr);
        displayarr(arr);
        int[] arr2={4, 2, 9, 10, 3, 7, 1, 0, 6, 5};
        countsort(arr2);
        displayarr(arr2);
    }
}
