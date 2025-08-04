package Stacks;

import java.util.Stack;

public class ValidParenthis {

    public static boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "([)]";
        String input3 = "(((";

        System.out.println(isValid(input2));
        System.out.println(isValid(input1));
        System.out.println(isValid(input3));
    }
}
