package realtimeApplicationPractice;
/*

You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z.
The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes.
How many $5 notes and $1 notes will you use?

Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible, then display -1.



| Sample Input                      | Expected Output             |
|----------------------------------|-----------------------------|
| $1 notes available = 2           | $1 notes needed = 1         |
| $5 notes available = 4           | $5 notes needed = 4         |
| Purchase amount = 21             |                             |
|----------------------------------|-----------------------------|
| $1 notes available = 3           | -1                          |
| $5 notes available = 3           |                             |
| Purchase amount = 19             |                             |
*/


import java.util.Scanner;


public class MiniNotesUsed {
    static Scanner sc = new Scanner(System.in);
    private static void mininotes(int ones, int five, int purchaseAmount) {
        int fnote=(purchaseAmount/5)-five;





    }

    public static void main(String[] args) {
        System.out.print("Enter $1 notes available:");
        int ones=sc.nextInt();
        System.out.print("Enter $5 notes available:");
        int five=sc.nextInt();
        System.out.print("Enter Purchase amount:");
        int PurchaseAmount=sc.nextInt();
        mininotes(ones,five,PurchaseAmount);


    }


}
