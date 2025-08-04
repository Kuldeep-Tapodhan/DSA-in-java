package Stacks;

class stacknode {
    int data;
    stacknode next;
}

class StackLL {
    stacknode head = null;
    int size = 0;

    public void push(int x) {
        stacknode temp = new stacknode();
        temp.data = x;
        temp.next = head;
        head = temp;
        size++;
    }

    public void pop() {
        if (head == null) {
            System.out.println("StackLL Underflow");
            return;
        }
        head = head.next;
        size--;
    }

    public boolean isempty() {
        if (size==0)return true;
        return false;
    }

    public int peek() {
        if (head == null) {
            System.out.println("StackLL is empty");
            return -1;
        }
        return head.data;
    }

    public void display() {
        if (head == null) {
            System.out.println("StackLL is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        stacknode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackViaLInkedList {
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        System.out.println("Is stack empty? " + stack.isempty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("After one pop:");
        stack.display();
        System.out.println("Is stack empty? " + stack.isempty());

        stack.pop();
        stack.pop();

        System.out.println("After popping all elements:");
        stack.display();

        stack.pop();

        System.out.println("Top element now: " + stack.peek());
    }
}
