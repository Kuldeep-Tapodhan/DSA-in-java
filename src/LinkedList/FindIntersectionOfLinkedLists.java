package LinkedList;

public class FindIntersectionOfLinkedLists {

    public static node findcomman(ll l1, ll l2) {
        node head1 = l1.getHead();
        node head2 = l2.getHead();

        node temp1 = head1;
        node temp2 = head2;

        int length1 = 0;
        int length2 = 0;

        while (temp1 != null) {
            length1++;
            temp1 = temp1.getNext();
        }

        while (temp2 != null) {
            length2++;
            temp2 = temp2.getNext();
        }

        temp1 = head1;
        temp2 = head2;

        if (length1 > length2) {
            int diff = length1 - length2;
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.getNext();
            }
        } else {
            int diff = length2 - length1;
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.getNext();
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }

        return null;
    }

    public static void main(String[] args) {
        node common = new node("X");
        node n1 = new node("Y");
        node n2 = new node("Z");

        common.setNext(n1);
        n1.setNext(n2);

        ll l1 = new ll();
        l1.addatend("A1");
        l1.addatend("A2");
        l1.addatend("A3");

        node tail1 = l1.getTail();
        tail1.setNext(common);

        ll l2 = new ll();
        l2.addatend("B1");
        l2.addatend("B2");

        node tail2 = l2.getTail();
        tail2.setNext(common);

        System.out.print("L1: ");
        l1.printAllElements();

        System.out.print("L2: ");
        l2.printAllElements();

        node intersection = findcomman(l1, l2);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.getData());
        } else {
            System.out.println("No intersection found.");
        }
    }
}
