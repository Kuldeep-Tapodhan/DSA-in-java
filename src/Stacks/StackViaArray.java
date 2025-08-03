package Stacks;

public class StackViaArray {

    static class Stack {
        int[] stack = new int[10];
        int i = 0;

        public void push(int n) {
            if (i >= stack.length) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[i] = n;
            i++;
        }

        public void pop() {
            if (i <= 0) {
                System.out.println("Stack Underflow");
                return;
            }
            i--;
        }

        public int peek() {
            if (i <= 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[i - 1];
        }

        public boolean isEmpty() {
            return i == 0;
        }

        public void display() {
            if (i == 0) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack (top to bottom): ");
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(stack[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.isEmpty());
        s.display();

        System.out.println("Top element: " + s.peek());

        s.pop();
        s.display();

        s.pop();
        s.pop();
        s.pop();
    }
}
