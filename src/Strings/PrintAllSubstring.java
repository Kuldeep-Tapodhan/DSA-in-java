package Strings;

import java.util.Scanner;

public class PrintAllSubstring {

    public  static  void substrigs(String s){
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length()+1 ; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        substrigs(s);
        sc.close();
    }
}
