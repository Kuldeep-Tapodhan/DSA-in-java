package LinkedList;

public class DeleteMiddleNode {

    public static node deleteMiddle(node head) {
        if (head == null || head.next == null) {
            return null;
        }

        int middle = 0;
        node fast = head;
        while (fast != null && fast.next != null) {
            middle++;
            fast = fast.next.next;
        }

        if (middle == 0) return head.next;

        node curr = head;
        for (int i = 0; i < middle - 1; i++) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }


    public static void main(String[] args) {
        ll list = new ll();
        list.addatend("1");
        list.addatend("2");
        list.addatend("3");
        list.addatend("4");
        list.addatend("5");
        list.printhelpeer();
        deleteMiddle(list.getHead());
        list.printhelpeer();

    }
}
