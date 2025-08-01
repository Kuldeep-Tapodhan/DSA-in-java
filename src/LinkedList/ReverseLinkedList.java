package LinkedList;

public class ReverseLinkedList {
    public static node reverselinkedlist(node head){
        node cur=head;
        node prev=null;
        node nex=null;

        while (cur!=null){
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        return prev;

    }
    public static node reverselinkedlistRecurisve(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node newHead = reverselinkedlist(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        ll l= new ll();
        l.addatend("1");
        l.addatend("2");
        l.addatend("3");
        l.addatend("4");
        l.addatend("5");
        l.addatend("6");
        l.addatend("7");
        l.addatend("8");
        l.addatend("9");
        l.addatend("10");
        l.addatend("11");
        l.addatend("12");
        l.addatend("13");
        l.addatend("14");
        l.printAllElements();
        l.setHead(reverselinkedlist(l.getHead()));
        l.printAllElements();

        l.setHead(reverselinkedlistRecurisve(l.getHead()));


        l.printAllElements();

    }
}
