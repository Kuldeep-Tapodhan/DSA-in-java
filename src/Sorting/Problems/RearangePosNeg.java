package Sorting.Problems;

public class RearangePosNeg {

    // Function to move all negative numbers to the front
    public static void segregateNegPos(int[] arr) {
        int j = 0; // Pointer for next negative placement

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap arr[i] and arr[j] if negative number found
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, -3, 4, -9, 8, -2};
        segregateNegPos(arr);

    }
}
