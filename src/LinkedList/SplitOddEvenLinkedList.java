package LinkedList;

public class SplitOddEvenLinkedList {


    public static  ll oddevenlist(node n){
        ll even= new ll();
        ll odd= new ll();
         node cur=n;
         while (cur.next!=null){
             int val = Integer.parseInt(cur.getData());
             if (val % 2 != 0) {
                 odd.addatend(String.valueOf(val));
             } else {
                 even.addatend(String.valueOf(val));
             }

             cur=cur.next;
         }
        if (even.getHead() == null) {
            return odd;
        } else {
            node evenTail = even.getHead();
            while (evenTail.next != null) {
                evenTail = evenTail.next;
            }
            evenTail.next = odd.getHead();
            return even;
        }
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
       ll l1 = oddevenlist(l.getHead());
       l1.printhelpeer();


    }
}
