package BasicJava.Recursion;

import java.util.Scanner;

public class gcd_lcm {

    static  int HCF(int x,int y){
        int i=1;
        int greatest=1;
        while(i<y){
            if (x%i==0 && y%i==0) {

                if (greatest<i){
                    greatest=i;
                }
            }
            i++;
        }
        return greatest;
    }


    static int lgcd(int x,int y){
        while (x%y!=0){
            int rem= x%y;
            x=y;
            y=rem;
        }
        return y;
    }



    // euclidian formula to find gcd is used here so chilll...
    static  int gcd(int x,int y){
        if(y==0) return x;
        return  gcd(y,x%y);
    }



    // here  is basic formula to find lcm with helf of gcd is used (jooo mujhe be yad nahi rehta😒)
    static  int lcm(int x,int y){
        int gcd = gcd(x,y);
        return  (x*y)/gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("GCD is :"+HCF(num1,num2));
        System.out.println("GCD is :"+lgcd(num1,num2));
        System.out.println("GCD is :"+gcd(num1,num2));
        System.out.println("LCM is :"+lcm(num1,num2));
    }
}
