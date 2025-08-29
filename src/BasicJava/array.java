package BasicJava;

import java.util.Arrays;
import java.util.Scanner;

import static BasicJava.helping.swap;
import static java.lang.Integer.MAX_VALUE;

public class array {

    // Function to demonstrate array declarations
    public static void arrayExample() {
        // Declaration and initialization of arrays
        int[] array;
        int arr[] = {1, 2, 3, 4}; // Array with initial values
        int[] arrr = new int[23]; // Array with 23 elements, default initialized to 0

        // Printing elements of the array
        for (int i = 0; i < 23; i++) {
            System.out.print(arrr[i] + " "); // All values will be zero since no values are assigned explicitly
        }
        System.out.println();

        // Enhanced for loop to print array elements
        for (int a : arr) {
            System.out.println(a);
        }
    }

    // Function to demonstrate sum, max, min, and search in an array
    public static void sumMaxMinSearchExample() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        int max = 0;
        int min = MAX_VALUE;
        int search = 3;
        int hass = -1;

        // Calculating sum, max, and min
        for (int a : arr) {
            sum += a;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }

        // Searching for an element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                hass = i;
            }
        }
        System.out.println("At index " + hass);
        System.out.println("Sum is: " + sum);
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }

    // Function to take input in an array and print it
    public static void inputAndPrintArrayExample(Scanner sc) {
        int arr[] = new int[10];
        System.out.print("Enter your Array: ");

        // Taking input from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Function to demonstrate array reference and cloning
    public static void arrayReferenceAndCloneExample() {
        int arr[] = {1, 2, 3, 4};

        // Referencing the array
        int arr2[] = arr; // No new memory assigned, arr2 references arr

        // Cloning the array
        int arr3[] = arr.clone(); // Clones arr and assigns new memory

        System.out.println("Array reference and cloning example.");
    }

    // Function to count occurrences of an element
    public static void countOccurrencesExample() {
        int arr[] = {23, 54, 33, 4, 23, 43, 23, 43, 34, 43};
        int count = 0;
        int sea = 34;

        // Counting occurrences of an element
        for (int value : arr) {
            if (value == sea) {
                count++;
            }
        }
        System.out.println("Occurrences of " + sea + ": " + count);
    }

    // Function to count elements greater than a certain value
    public static void countGreaterThanExample() {
        int ar[] = {1, 2, 3, 4, 5, 6, 74, 3, 3, 254, 3, 32, 55};
        int greaterThan = 6;
        int count = 0;

        // Counting elements greater than a specified value
        for (int value : ar) {
            if (value > greaterThan) {
                count++;
            }
        }
        System.out.println("Elements greater than " + greaterThan + ": " + count);
    }

    // Function to check if an array is sorted
    public static void checkSortedArrayExample() {
        boolean sorted = true;
        int arr2[] = {1, 2, 3, 4, 5, 16, 7, 8, 9};

        // Checking if the array is sorted
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[i - 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Array sorted: " + sorted);
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int n = arr.length;

        // Swapping elements to reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reversearr2(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right)
        {
            swap(arr,left,right);
            left++;
            right--;
        }

    }

    // Function to find the second largest element in an array
    public static void secondLargestElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        // Finding the second largest element
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i < first) {
                second = i;
            }
        }
        System.out.println("Second largest element: " + second);
    }

    // Function to find unique elements in an array
    public static void findUniqueElements(int[] arr) {
        System.out.print("Unique elements: ");

        // Finding and printing unique elements
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // Function to merge two arrays
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Merging arrays using System.arraycopy
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    // Function to rotate an array to the left by a given number of positions
    public static void rotateArrayLeft(int[] arr, int positions) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        // Rotating the array
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = arr[(i + positions) % n];
        }
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    }

    public int removeElement(int[] nums, int val) {

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Examples of different array declarations
        arrayExample();

        // Sum, max, min, and search in an array
        sumMaxMinSearchExample();

        // Taking input in an array and printing it
        inputAndPrintArrayExample(sc);

        // Example of array reference and cloning
        arrayReferenceAndCloneExample();

        // Count occurrences of an element
        countOccurrencesExample();

        // Count elements greater than a certain value
        countGreaterThanExample();

        // Check if an array is sorted
        checkSortedArrayExample();

        // Reverse an array
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);

        // Find the second largest element in an array
        secondLargestElement(arr);

        // Find unique elements in an array
        int[] arrWithDuplicates = {1, 2, 2, 3, 4, 4, 5};
        findUniqueElements(arrWithDuplicates);

        // Merge two arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        mergeArrays(arr1, arr2);

        // Rotate an array to the left by a given number of positions
        int[] arrToRotate = {1, 2, 3, 4, 5};
        rotateArrayLeft(arrToRotate, 2);

        sc.close();
    }
}
