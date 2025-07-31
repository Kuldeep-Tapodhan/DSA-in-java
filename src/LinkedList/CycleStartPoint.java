package LinkedList;

public class CycleStartPoint {


    public static node startpoint(node head){
        node slow=head;
        node fast=head;
        while (fast != null && fast.getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast)break;
        }
        if (fast == null || fast.next == null) return null;
        node start=head;
        while (slow!=start){
            slow=slow.next;
            start=start.next;
        }

        return start;
    }

    public static void main(String[] args) {

        ll cycleList = new ll();
        cycleList.addatend("100");
        cycleList.addatend("200");
        cycleList.addatend("300");
        cycleList.addatend("400");

        node temp = cycleList.getHead();
        node cycleStart = null;
        while (temp.getNext() != null) {
            if (temp.data.equals("200")) {
                cycleStart = temp;
            }
            temp = temp.getNext();
        }
        temp.setNext(cycleStart);

        System.out.println(startpoint(cycleList.getHead()).getData());

    }
}
