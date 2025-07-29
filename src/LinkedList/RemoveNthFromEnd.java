package LinkedList;

public class RemoveNthFromEnd {

    public static node removeNthFromEnd(node head, int n) {
        int size = 0;
        node cur = head;

        while (cur != null) {
            size++;
            cur = cur.getNext();
        }

        if (n == size) {
            return head.getNext();
        }

        int rem = size - n;
        node curr = head;

        for (int i = 0; i < rem - 1; i++) {
            curr = curr.getNext();
        }

        curr.setNext(curr.getNext().getNext());
        return head;
    }

    public static void main(String[] args) {
        ll s = new ll();
        s.addatend("deep");
        s.addatend("kuldeep");
        s.addatend("nayan");
        s.addatend("jack");
        s.addatend("kevin");

        s.printhelpeer();
        removeNthFromEnd(s.getHead(), 2);


        s.printhelpeer();
    }
}
