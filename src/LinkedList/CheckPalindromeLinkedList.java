package LinkedList;

public class CheckPalindromeLinkedList {

    public  static node reversell(node n){
       node curr=n;
       node prev=null;
       node nex=null;
       while (curr!=null){
           nex=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nex;
       }
       return prev;
    }
    public static boolean ispalindrome(node head){

       node fast=head;
       node slow=head;
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }

       node temp=reversell(slow.next);
       slow.next=temp;

       node p1=head;
       node p2=slow.next;
       while (p2!=null){
           if (p1.data!= p2.data)return false;
           p1=p1.next;
           p2=p2.next;
       }
        return true;
    }


    public static void main(String[] args) {

        ll palindromeList = new ll();
        palindromeList.addatend("1");
        palindromeList.addatend("2");
        palindromeList.addatend("3");
        palindromeList.addatend("2");
        palindromeList.addatend("1");

        System.out.println("Palindrome List:");
        palindromeList.printAllElements();
        System.out.println(ispalindrome(palindromeList.getHead()));



        ll nonPalindromeList = new ll();
        nonPalindromeList.addatend("1");
        nonPalindromeList.addatend("2");
        nonPalindromeList.addatend("3");
        nonPalindromeList.addatend("4");
        nonPalindromeList.addatend("5");

        System.out.println("Non-Palindrome List:");
        nonPalindromeList.printAllElements();
        System.out.println(ispalindrome(nonPalindromeList.getHead()));
    }
}
