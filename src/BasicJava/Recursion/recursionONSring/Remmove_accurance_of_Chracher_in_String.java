package BasicJava.Recursion.recursionONSring;

import java.util.Scanner;
// program that removes all the occurance of a character from the string...
public class Remmove_accurance_of_Chracher_in_String {


    public  static  String rremovechar(String str,char ch){
        int i=0;
        String ans = "";
        while (i<str.length()){
         if (str.charAt(i)!=ch){
             ans+=str.charAt(i);
         }
         i++;
        }
        return ans;
    }

    public static String RemoveCharViaRecursion(String str,int i,char c){

        if(str.length()==i){
            return "";
        }

        String ans=RemoveCharViaRecursion(str,i+1,c);
        char ch =str.charAt(i);
        if (ch!=c){
            return  ch+ans;
        }
        else {
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String string=sc.nextLine();
        System.out.println("Enter character to be removed:");
        char ch =sc.next().charAt(0);
        System.out.println(string);
        System.out.println(ch);
        System.out.println(rremovechar(string,ch));

        System.out.println(RemoveCharViaRecursion(string,0,ch));
    }
}
