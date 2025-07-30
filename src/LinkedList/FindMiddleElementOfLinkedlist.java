    package LinkedList;

    public class FindMiddleElementOfLinkedlist {

        public static node middlenode(node n){

            int length1 = 0;
            node middle=n;
            while (n != null) {
                length1++;
                n = n.getNext();
            }

            for (int i = 0; i < length1 / 2; i++) {
                middle = middle.getNext();
            }

            return middle;
        }

        public static node middlenodeopimze(node head) {
            node slow = head;
            node fast = head;

            while (fast != null && fast.getNext() != null) {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }

            return slow;
        }

        public static void main(String[] args) {
            ll list = new ll();
            list.addatend("A");
            list.addatend("B");
            list.addatend("C");
            list.addatend("D");
            list.addatend("E");
            list.addatend("F");
            list.addatend("G");

            System.out.print("Linked List: ");
            list.printAllElements();
            System.out.println(middlenode(list.getHead()).getData());
            System.out.println(middlenodeopimze(list.getHead()).getData());
        }
    }
