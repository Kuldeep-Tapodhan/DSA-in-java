package Stacks;

import java.util.Arrays;
import java.util.Stack;

import static BasicJava.helping.displayarr;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                result[i]=-1;
            }
            else {
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 6, 3, 4};
        displayarr(nextGreaterElement(arr));
        int[] arr2 = {5, 4, 3, 2, 1};
        displayarr(nextGreaterElement(arr2));

        int[] arr3 = {1, 2, 3, 4, 5};
        displayarr(nextGreaterElement(arr3));

        int[] arr4 = {6, 5, 4, 5, 6};
        displayarr(nextGreaterElement(arr4));

        int[] arr5 = {-2, -5, -1, -8, -3};
        displayarr(nextGreaterElement(arr5));

    }
}
