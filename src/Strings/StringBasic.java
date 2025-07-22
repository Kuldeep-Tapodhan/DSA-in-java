package Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringBasic {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "Deep Tapodhan";
        System.out.println(str);
//        System.out.println("Enter the String:");
//        String str2=sc.nextLine();
//        System.out.println(str2);
//        String str1= sc.next();;
//        System.out.println(str1);
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf('T'));


        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
//        System.out.println(str.trim());

        System.out.println(str.replace(' ','_'));
        System.out.println(str.repeat(3));
        System.out.println(str.compareToIgnoreCase("deep tapodhan"));
        System.out.println(str.substring(0,4));
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "apple";
        String s4 = "Apple";
        String s5 = "app";
        String s6 = null;


        /**

         If two strings differ at index i, then this.compareTo(other) returns: this.charAt(i) - other.charAt(i) where charAt(i) gives the Unicode (ASCII) value of the character at mismatch index.
         **/
        System.out.println("s1 vs s2: " + s1.compareTo(s2));      // < 0 (apple < banana)
        System.out.println("s2 vs s1: " + s2.compareTo(s1));      // > 0 (banana > apple)
        System.out.println("s1 vs s3: " + s1.compareTo(s3));      // = 0 (apple == apple)
        System.out.println("s4 vs s1: " + s4.compareTo(s1));      // < 0 (Unicode comparison, capital A < lowercase a)
        System.out.println("s5 vs s1: " + s5.compareTo(s1));      // < 0 (shorter string with same prefix)
        System.out.println("Ignore case s4 vs s1: " + s4.compareToIgnoreCase(s1)); // = 0 (case-insensitive)

        // Handling null explicitly
        try {
            System.out.println("s1 vs null: " + s1.compareTo(s6)); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("s1 vs null: NullPointerException caught");
        }

    }

}
