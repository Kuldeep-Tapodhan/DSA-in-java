package Stacks;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {




    public static Stack removeconsecitvesubseq(int[] arr){

        if (arr == null) {
            return new Stack<Integer>();
        }
        int n=arr.length;

        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n ; i++) {
            if (st.isEmpty() || st.peek()!=arr[i])st.push(arr[i]);
            else if (st.peek()==arr[i]) {
                if (i==n-1 || st.peek()!=arr[i+1])st.pop();

            }
        }

        return st;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,4,4,5,6,7,8,8,8,9,9,9};
        System.out.println(removeconsecitvesubseq(arr));
        int[] ar=null;
        System.out.println(removeconsecitvesubseq(ar));
    }
}
