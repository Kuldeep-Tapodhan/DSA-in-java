package BasicJava;

public class ArrayProblems2 {

    /**
     * Method to find the total number of pairs in the array whose sum is equal to the given value x
     * @param array Array of integers
     * @param target Target sum value
     * @return Total number of pairs
     */
    public static int countPairsWithSum(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Method to find the total number of triplets in the array whose sum is equal to the given value x
     * @param array Array of integers
     * @param target Target sum value
     * @return Total number of triplets
     */
    public static int countTripletsWithSum(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if ((array[i] + array[j] + array[k]) == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Method to find the unique number in the given array where all the elements are repeated twice
     * @param array Array of integers
     * @return Unique number
     */
    public static int findUniqueNumber(int[] array) {
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                ans = array[i];
                break;
            }
        }
        return ans;
    }

    /**
     * Method to find the second largest element in the array
     * @param arr Array of integers
     * @return Second largest element
     */
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value > second && value < largest) {
                second = value;
            }
        }
        return second;
    }

    /**
     * Method to swap two numbers using a temporary variable
     * @param a First integer
     * @param b Second integer
     */
    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with temp: a = " + a + ", b = " + b);
    }

    /**
     * Method to swap two numbers using the sum and difference method
     * @param a First integer
     * @param b Second integer
     */
    public static void swapWithSumDifference(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping with sum and difference: a = " + a + ", b = " + b);
    }

    /**
     * Method to reverse an array
     * @param arr Array of integers
     */
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapElements(arr, i, j);
            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    /**
     * Helper method to swap elements in an array
     * @param arr Array of integers
     * @param a Index of first element
     * @param b Index of second element
     */
    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Method to rotate elements in the array
     * @param arr Array of integers
     * @param k Number of positions to rotate
     */
    public static void rotateElements(int[] arr, int k) {
        int n = arr.length;
        int[] arrr2 = new int[n];
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arrr2[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arrr2[j++] = arr[i];
        }

        System.out.print("Rotated array: ");
        for (int i = 0; i < arrr2.length; i++) {
            System.out.print(arrr2[i] + " ");
        }
        System.out.println();
    }

    /**
     * Method to reverse the array without using extra space
     * @param arr Array of integers
     * @param k Number of positions to reverse
     */
    public static void reverseWithoutUsingExtraSpace(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverseArrayRange(arr, 0, n - k - 1);
        reverseArrayRange(arr, n - k, n - 1);
        reverseArrayRange(arr, 0, n - 1);

        System.out.print("Reversed array without extra space: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Helper method to reverse a range within the array
     * @param arr Array of integers
     * @param start Start index
     * @param end End index
     */
    public static void reverseArrayRange(int[] arr, int start, int end) {
        while (start < end) {
            swapElements(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example usage of the methods
        int[] array = {1, 4, 5, 6, 3};
        int targetPair = 7;
        int targetTriplet = 12;

        System.out.println("Number of pairs with sum " + targetPair + ": " + countPairsWithSum(array, targetPair));
        System.out.println("Number of triplets with sum " + targetTriplet + ": " + countTripletsWithSum(array, targetTriplet));

        int[] uniqueArray = {1, 2, 3, 4, 2, 1, 3};
        System.out.println("Unique number in the array: " + findUniqueNumber(uniqueArray));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Second largest element in the array: " + findSecondLargest(arr));

        int a = 5, b = 4;
        swapWithTemp(a, b);
        swapWithSumDifference(a, b);

        reverseArray(arr);

        rotateElements(arr, 7);

        reverseWithoutUsingExtraSpace(arr, 3);
    }
}


//Number of pairs with sum 7: 2
//Number of triplets with sum 12: 2
//Unique number in the array: 4
//Second largest element in the array: 7
//After swapping with temp: a = 4, b = 5
//After swapping with sum and difference: a = 4, b = 5
//Reversed array: 8 7 6 5 4 3 2 1
//Rotated array: 7 6 5 4 3 2 1 8
//Reversed array without extra space: 3 2 1 8 7 6 5 4
