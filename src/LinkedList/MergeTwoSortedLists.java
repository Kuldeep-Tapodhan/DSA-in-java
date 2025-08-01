package LinkedList;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

class linedlist {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public void addatend(int data){
        Node n = new Node(data);
        if (this.head == null){
            this.head = this.tail = n;
        }
        else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    public void printhelpeer(){
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}

public class MergeTwoSortedLists {

    public static linedlist mergetwolist(Node h1, Node h2) {
        linedlist mergedList = new linedlist();
        while(h1 != null && h2 != null){
            if(h1.getData() <= h2.getData()) {
                mergedList.addatend(h1.getData());
                h1 = h1.getNext();
            } else {
                mergedList.addatend(h2.getData());
                h2 = h2.getNext();
            }
        }
        while(h1 != null) {
            mergedList.addatend(h1.getData());
            h1 = h1.getNext();
        }
        while(h2 != null) {
            mergedList.addatend(h2.getData());
            h2 = h2.getNext();
        }
        return mergedList;
    }

    public static void main(String[] args) {
        linedlist list1 = new linedlist();
        list1.addatend(1);
        list1.addatend(3);
        list1.addatend(5);
        list1.addatend(7);

        linedlist list2 = new linedlist();
        list2.addatend(2);
        list2.addatend(4);
        list2.addatend(6);
        list2.addatend(8);

        System.out.println("First Sorted Linked List:");
        list1.printhelpeer();

        System.out.println("Second Sorted Linked List:");
        list2.printhelpeer();

        linedlist mergedList = mergetwolist(list1.getHead(), list2.getHead());
        System.out.println("Merged Sorted Linked List:");
        mergedList.printhelpeer();
    }
}
