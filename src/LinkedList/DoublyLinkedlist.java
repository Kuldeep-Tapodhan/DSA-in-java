package LinkedList;



class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    DNode head;

    // Add node at the end
    public void addAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.prev = cur;
    }

    // Print from head to tail
    public void printForward() {
        DNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Print from tail to head
    public void printBackward() {
        if (head == null) return;

        DNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addAtEnd(10);
        dll.addAtEnd(20);
        dll.addAtEnd(30);
        dll.addAtEnd(40);
        dll.addAtEnd(50);
        dll.addAtEnd(60);

        System.out.print("Forward: ");
        dll.printForward();     // Output: 10 20 30

        System.out.print("Backward: ");
        dll.printBackward();    // Output: 30 20 10
    }
}
