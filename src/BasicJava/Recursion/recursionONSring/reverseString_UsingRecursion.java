package BasicJava.Recursion.recursionONSring;

import java.util.Scanner;

public class reverseString_UsingRecursion {

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
        System.out.println(reverseString(string,0));
    }
}
