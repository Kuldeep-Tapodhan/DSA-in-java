package Stacks;

import java.util.Stack;

public class Infix {

    public static int evaluateInfix(String exp) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ' ') continue;

            // If digit, push to value stack (using ASCII)
            if (ch >= '0' && ch <= '9') {
                values.push((int) ch - 48); // ASCII of '0' is 48
            }

            // If opening bracket
            else if (ch == '(') {
                ops.push(ch);
            }

            // If closing bracket
            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    values.push(apply(ops.pop(), values.pop(), values.pop()));
                }
                if (!ops.isEmpty()) ops.pop(); // remove '('
            }

            // If operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    values.push(apply(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(ch);
            }
        }

        // Final result
        while (!ops.isEmpty()) {
            values.push(apply(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    private static int apply(char op, int b, int a) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') return a / b;
        return 0;
    }

    public static void main(String[] args) {
        String expression = "3+(2*2)-1";
        int result = evaluateInfix(expression);
        System.out.println("Result: " + result); // Output: 6
    }
}
