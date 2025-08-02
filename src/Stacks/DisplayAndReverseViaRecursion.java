package Stacks;

import java.util.Stack;

public class DisplayAndReverseViaRecursion {

    public static void displaystack(Stack<Integer> s){
        if (s.isEmpty()) return;
        int top = s.pop();
        displaystack(s);
        System.out.print(top+" ");
        s.push(top);
    }
    public static void reversedisplay(Stack<Integer> s){
        if (s.isEmpty()) return;
        int top = s.pop();
        System.out.print(top+" ");
        displaystack(s);
        s.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(2);
        s.push(13);
        s.push(15);
        displaystack(s);
        System.out.println();
        reversedisplay(s);
    }
}