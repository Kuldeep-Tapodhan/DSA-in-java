package BasicJava.BinarySearch.Problems;

public class FindMinimumInRotatedSortedArray {



    public static int  find_minin_roated_array(int[] arr){
        if (arr.length==0)return -1;
        int low=0;
        int high=arr.length-1;
        while (low < high) {
            int mid = (low + high) / 2;
            if(arr[mid]>arr[high])low=mid+1;
            else if(arr[mid]<arr[high])high=mid;
            else high--;
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 3, 4,5};
        System.out.println(find_minin_roated_array(arr));
    }
}
