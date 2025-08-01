package LinkedList;

public class RemoveDuplicatesFromSortedLinkedList {


    public static void removeduplicat(node head){
        node cur=head;

        while (cur!=null && cur.next!=null ){
           if (cur.getData().equals(cur.next.getData())){
               cur.next=cur.next.next;
           }
           else {
               cur=cur.next;
           }
        }
    }

    public static void main(String[] args) {
        ll l = new ll();
        l.addatend("1");
        l.addatend("2");
        l.addatend("2");
        l.addatend("3");
        l.addatend("4");
        l.addatend("4");
        l.addatend("4");
        l.addatend("5");
        l.addatend("6");
        l.addatend("6");
        l.addatend("7");
        l.addatend("8");
        l.addatend("8");
        l.addatend("9");
        l.addatend("10");

        l.printAllElements();
        removeduplicat(l.getHead());
        l.printAllElements();
    }
}
