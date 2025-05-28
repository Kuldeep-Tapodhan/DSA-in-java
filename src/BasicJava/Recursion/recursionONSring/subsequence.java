package BasicJava.Recursion.recursionONSring;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {

    static ArrayList<String> subseque(String str){
        ArrayList<String> answer= new ArrayList<>();
        if (str.length()==0){
            answer.add("");
            return  answer;
        }
        char currentch=str.charAt(0);
        ArrayList<String> subans=subseque(str.substring(1));
        for(String ss: subans){
            answer.add(ss);
            answer.add(currentch+ss);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String:");
        String string =sc.next();
        ArrayList<String> result= subseque(string);
        for (String s : result) {
            if (!s.isEmpty()) {
                System.out.print(s + " ");
            }
        }

    }

}
