package BasicJava;
import java.util.Scanner;

public class Prefixarray {

    static void Printarray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] PrefixArray(int[] array){
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }

    // give prefix between specific range
    // Note that this must follow the 1-based index
    static void RangePrefixArray(int[] array, int start, int end){
        // Convert to 0-based indexing for internal calculations
        start = start - 1;
        end = end - 1;
        for (int i = start + 1; i <= end; i++) {
            array[i] = array[i - 1] + array[i];
        }

        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    static  int Sumofrange(int[] array,int start,int end){
        start = start - 1;
        end = end - 1;
        int sum=0;
        for (int i = start + 1; i <= end; i++) {

            array[i] = array[i - 1] + array[i];
            sum+=array[i];
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter " + size + " Array elements:");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Call RangePrefixArray with 1-based indices
        System.out.print("Range Prefix Array (1-based indices): ");
        RangePrefixArray(a, 2, 4);

        // Print the entire array to see the changes
        System.out.print("Modified Array: ");
        Printarray(a);
    }
}
