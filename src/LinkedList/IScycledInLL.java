package LinkedList;

public class IScycledInLL {


    public  static  boolean iscycled(node n){
        node slow=n;
        node fast=n;
        while (fast != null && fast.getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast)return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ll nonCycleList = new ll();
        nonCycleList.addatend("10");
        nonCycleList.addatend("20");
        nonCycleList.addatend("30");
        nonCycleList.addatend("40");

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


        System.out.println(iscycled(cycleList.getHead()));
        System.out.println(iscycled(nonCycleList.getHead()));

    }
}
