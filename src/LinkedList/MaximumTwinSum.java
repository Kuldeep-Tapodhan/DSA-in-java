package LinkedList;

public class MaximumTwinSum {

    public static node reverse(node head) {
        node prev = null;
        node curr = head;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static int pairSum(node head) {
        if (head == null || head.next == null) return 0;

        node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        node secondHalf = reverse(slow);

        int maxSum = 0;
        node firstHalf = head;
        node p2 = secondHalf;

        while (p2 != null) {
            int sum = Integer.parseInt(firstHalf.data) + Integer.parseInt(p2.data);
            maxSum = Math.max(maxSum, sum);
            firstHalf = firstHalf.next;
            p2 = p2.next;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addatend("1");
        list.addatend("2");
        list.addatend("3");
        list.addatend("4");


        System.out.println(pairSum(list.getHead()));
    }
}
