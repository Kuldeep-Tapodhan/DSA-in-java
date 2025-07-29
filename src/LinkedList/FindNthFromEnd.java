package LinkedList;

public class FindNthFromEnd {

    public static void nnodefromend(node head, int n) {
        node first = head;
        node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("Position is greater than the length of the list.");
                return;
            }
            first = first.getNext();
        }

        while (first != null) {
            first = first.getNext();
            second = second.getNext();
        }

        System.out.println(n+" node from end: " + second.getData());
    }

    public static void main(String[] args) {
        ll s = new ll();
        s.addatend("deep");
        s.addatend("kuldeep");
        s.addatend("nayan");
        s.addatend("jack");
        s.addatend("kevin");

        System.out.println("Linked List:");
        s.printhelpeer();

        int n = 2;
        nnodefromend(s.getHead(), n);
    }
}
