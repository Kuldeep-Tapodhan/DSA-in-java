package Sorting.Problems;

import static BasicJava.helping.displayarr;
import static BasicJava.helping.swap;

public class RearangePosNeg {

    // Function to move all negative numbers to the front
    public static void segregateNegPos(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    swap(arr,i,j);
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, -3, 4, -9, 8, -2};
        segregateNegPos(arr);
        displayarr(arr);

    }
}
