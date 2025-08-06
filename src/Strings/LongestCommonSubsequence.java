package Strings;

import java.util.Stack;

public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String s1, String s2) {

        if(s1.isEmpty() || s2.isEmpty())return 0;
        Stack<Character> sta=new Stack<>();
        int j=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==s2.charAt(j)){
                sta.push(s2.charAt(j));
                j++;

            }
        }
        return sta.size();
    }



    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));       // Output: 3
        System.out.println(longestCommonSubsequence("abc", "abc"));         // Output: 3
        System.out.println(longestCommonSubsequence("abc", "def"));         // Output: 0
        System.out.println(longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }
}
