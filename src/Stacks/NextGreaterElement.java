package Stacks;

import java.util.Arrays;
import java.util.Stack;

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
        int[] result = nextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }
}
