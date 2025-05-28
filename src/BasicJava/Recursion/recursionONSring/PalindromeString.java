package BasicJava.Recursion.recursionONSring;

import java.util.Scanner;

public class PalindromeString {
    public  static String reverseString(String str,int i){
        if (str.length()==i)return "";
        String ans= reverseString(str,i+1);
        return ans+str.charAt(i);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String string=sc.nextLine();
        System.out.println(string);
        String revers=reverseString(string,0);
        if (revers.equals(string)) System.out.println(string+" is Palindrome");
        else System.out.println(string+" is not palinndrome");
    }
}
