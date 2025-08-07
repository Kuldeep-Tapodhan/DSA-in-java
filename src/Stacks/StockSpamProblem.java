package Stacks;
import java.util.Stack;

import static Sorting.mergesort.displayArr;

public class StockSpamProblem {
    public static int[] stockSpan(int[] prices) {
        if (prices == null || prices.length == 0) {
            return new int[0];
        }
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        displayArr(stockSpan(arr));
    }
}
