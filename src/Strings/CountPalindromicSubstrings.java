package Strings;

import java.util.Scanner;

public class CountPalindromicSubstrings {


    public static boolean ispalindrome(String str){
        int j=str.length()-1;
        int i=0;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {

        String str= "abcba";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length()+1 ; j++) {
                if (ispalindrome(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }

        }
        System.out.println(count);
    }



}
