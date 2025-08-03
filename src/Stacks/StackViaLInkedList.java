package Stacks;

class node {
    int data;
    node next;
}

class Stack {
    node head = null;

    public void push(int x) {
        node temp = new node();
        temp.data = x;
        temp.next = head;
        head = temp;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
}

public class StackViaLInkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
    }
}
