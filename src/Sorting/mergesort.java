package Sorting;

import java.util.Vector;

public class mergesort {

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }


    public static void mergesortt(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergesortt(arr, 0, mid);
        mergesortt(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

        public static void merge(Vector<Integer> arr, int l, int mid, int r) {
            int n1 = mid - l + 1;
            int n2 = r - mid;

            Vector<Integer> left = new Vector<>(n1);
            Vector<Integer> right = new Vector<>(n2);

            // Copy data to temp vectors
            for (int i = 0; i < n1; i++) {
                left.add(arr.get(l + i));
            }
            for (int i = 0; i < n2; i++) {
                right.add(arr.get(mid + 1 + i));
            }

            // Merge the temp vectors
            int i = 0, j = 0;
            int k = l;

            while (i < n1 && j < n2) {
                if (left.get(i) <= right.get(j)) {
                    arr.set(k++, left.get(i++));
                } else {
                    arr.set(k++, right.get(j++));
                }
            }

            // Copy remaining elements
            while (i < n1) {
                arr.set(k++, left.get(i++));
            }

            while (j < n2) {
                arr.set(k++, right.get(j++));
            }
        }

        public static void mergeSort(Vector<Integer> arr, int l, int r) {
            if (l < r) {
                int mid = l + (r - l) / 2;
                mergeSort(arr, l, mid);
                mergeSort(arr, mid + 1, r);
                merge(arr, l, mid, r);
            }
        }


        public static void displayArr(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        public static void main(String[] args) {
            int[] arr = {3, 11, 13, 9, 2};
            int n = arr.length;
            System.out.println("Array before sorting");
            displayArr(arr);
            mergesortt(arr, 0, n - 1);
            System.out.println();
            System.out.println("Array after sorting");
            displayArr(arr);

            Vector<Integer> numbers = new Vector<>();
            numbers.add(38);
            numbers.add(27);
            numbers.add(43);
            numbers.add(3);
            numbers.add(9);
            numbers.add(82);
            numbers.add(10);
            System.out.println();

            System.out.println(numbers);
            mergeSort(numbers, 0, numbers.size() - 1);
            System.out.println(numbers);
        }
    }
