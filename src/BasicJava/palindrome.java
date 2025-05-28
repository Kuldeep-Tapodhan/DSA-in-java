package BasicJava;

import java.util.Scanner;

public class palindrome {


    public static boolean isPalindrome(int x) {
        int original=x;
        int reverse=0;
        while(x>0){
            int rem= x%10;
            reverse=reverse*10+rem;
            x/=10;
        }
        if(original==reverse){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
