package LinkedList;

public class MergeTwoSortedLists {

    public static node mergetwolistInPlace(node h1, node h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;

        node head;
        if (h1.getData().compareTo(h2.getData()) <= 0) {
            head = h1;
            h1 = h1.getNext();
        } else {
            head = h2;
            h2 = h2.getNext();
        }
        node current = head;

        while (h1 != null && h2 != null) {
            if (h1.getData().compareTo(h2.getData()) <= 0) {
                current.setNext(h1);
                h1 = h1.getNext();
            } else {
                current.setNext(h2);
                h2 = h2.getNext();
            }
            current = current.getNext();
        }

        if (h1 != null) {
            current.setNext(h1);
        } else {
            current.setNext(h2);
        }

        return head;
    }

    public static ll mergetwolist(node h1, node h2) {
        ll mergedList = new ll();
        while (h1 != null && h2 != null) {
            if (h1.getData().compareTo(h2.getData()) <= 0) {
                mergedList.addatend(h1.getData());
                h1 = h1.getNext();
            } else {
                mergedList.addatend(h2.getData());
                h2 = h2.getNext();
            }
        }
        while (h1 != null) {
            mergedList.addatend(h1.getData());
            h1 = h1.getNext();
        }
        while (h2 != null) {
            mergedList.addatend(h2.getData());
            h2 = h2.getNext();
        }
        return mergedList;
    }

    public static void main(String[] args) {
        ll list1 = new ll();
        list1.addatend("1");
        list1.addatend("3");
        list1.addatend("5");
        list1.addatend("7");

        ll list2 = new ll();
        list2.addatend("2");
        list2.addatend("4");
        list2.addatend("6");
        list2.addatend("8");

        System.out.println("First Sorted Linked List:");
        list1.printhelpeer();

        System.out.println("Second Sorted Linked List:");
        list2.printhelpeer();

        ll mergedList = mergetwolist(list1.getHead(), list2.getHead());
        System.out.println("Merged Sorted Linked List (new list):");
        mergedList.printhelpeer();

        // For in-place merge, recreate lists as the previous lists are unchanged
        ll list3 = new ll();
        list3.addatend("1");
        list3.addatend("3");
        list3.addatend("5");
        list3.addatend("7");

        ll list4 = new ll();
        list4.addatend("2");
        list4.addatend("4");
        list4.addatend("6");
        list4.addatend("8");

        node mergedHeadInPlace = mergetwolistInPlace(list3.getHead(), list4.getHead());
        ll mergedListInPlace = new ll();
        mergedListInPlace.setHead(mergedHeadInPlace);

        System.out.println("Merged Sorted Linked List (in-place):");
        mergedListInPlace.printhelpeer();
    }
}
