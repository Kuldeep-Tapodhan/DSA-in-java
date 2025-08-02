package Stacks;

import java.util.Stack;

public class Baisc {


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(2);
        s.push(13);
        s.push(15);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.size());

    }
}
