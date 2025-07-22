package Sorting.Problems;
import static BasicJava.helping.displayarr;
import static BasicJava.helping.max;

public class ZeroOneTwoSorter {


    public  static  void zeroonetwo(int[] arr){
        int n=arr.length;
        int max= max(arr);
        int[] count = new int[max+1];
        int[] ans = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i =arr.length-1; i>=0 ; i--) {
            int index=count[arr[i]]-1;
            ans[index]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=ans[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 2, 1, 0};
        zeroonetwo(arr);
        displayarr(arr);
    }
}
