package Stacks;

import java.util.Stack;

public class MinimumRemoveValidParentheses {

    public static int miniremoeparen(String s) {
        if (s == null || s.isEmpty()) return 0;

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }

        return count + stack.size();
    }

    public static void main(String[] args) {
        System.out.println(miniremoeparen("([)]"));
        System.out.println(miniremoeparen("((()))"));
        System.out.println(miniremoeparen("((()"));
        System.out.println(miniremoeparen("{[()]}"));
        System.out.println(miniremoeparen("{[(])}"));
        System.out.println(miniremoeparen("({[)]"));
        System.out.println(miniremoeparen(""));
        System.out.println(miniremoeparen("()[]{}"));
        System.out.println(miniremoeparen("(((]]]"));
        System.out.println(miniremoeparen("(()))(()"));
    }
}
