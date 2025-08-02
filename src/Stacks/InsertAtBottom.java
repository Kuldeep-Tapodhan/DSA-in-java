package Stacks;

import java.util.Stack;

public class InsertAtBottom {


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(2);
        s.push(13);
        s.push(15);
        System.out.println(s);
        int[] arr=new int[s.size()];
        int i=0;
        while (s.size()>0){
            arr[i]= s.pop();
            i++;

        }
        s.push(11);
        for (int j = arr.length-1; j >=0; j--) {
            s.push(arr[j]);
        }
        System.out.println(s);
    }
}
