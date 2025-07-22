package Sorting.Problems;

import static BasicJava.helping.displayarr;

public class FixSwappedElements {

    public static void fixsort(int[] arr) {
        int[] swapindex = new int[2];
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (j == 0) {
                    swapindex[j++] = i - 1;
                }
                swapindex[1] = i;
            }
        }


        int temp = arr[swapindex[0]];
        arr[swapindex[0]] = arr[swapindex[1]];
        arr[swapindex[1]] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 5, 7, 4, 9};
        fixsort(arr);
        displayarr(arr);
    }
}
