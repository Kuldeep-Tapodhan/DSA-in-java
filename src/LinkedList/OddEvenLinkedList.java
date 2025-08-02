package LinkedList;

public class OddEvenLinkedList {

    public  static node oddeven(node head){

        if (head==null || head.next==null)return head;

        node odd=head;
        node even=head.next;
        node evenh=even;

        while (even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenh;

        return head;
    }

    public static void main(String[] args) {
        ll l= new ll();
        l.addatend("10");
        l.addatend("11");
        l.addatend("1");
        l.addatend("4");
        l.addatend("6");
        l.addatend("5");
        l.addatend("7");
        l.addatend("12");
        l.addatend("16");
        l.addatend("9");
        l.printAllElements();

        node newHead = oddeven(l.getHead());
        l.setHead(newHead);
        l.printAllElements();



    }
}
