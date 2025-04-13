package BasicJava.Reinforcement;
import java.util.Scanner;
public class R_1_3 {
    public static boolean multple(long n,long m){
        boolean flag=false;
        for (int i = 1; i <=n ; i++) {
            if (n==m*i){
                  flag=true;
            }
        }
        return flag;
    }
    public static boolean isEven(int i) {
        // Use bitwise AND operation to check if the last bit is 0
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Two Positive Long Integer:");
//        long m= sc.nextLong();
//        long n= sc.nextLong();
//
//        System.out.println("Multiple Exist:"+multple(m,n));


        // Test the isEven method with different numbers
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 6, -2, -3, 100, -101};

        System.out.println("Testing if numbers are even:");
        for (int num : testNumbers) {
            System.out.printf("Is %d even? %b%n", num, isEven(num));
        }

    }



}
