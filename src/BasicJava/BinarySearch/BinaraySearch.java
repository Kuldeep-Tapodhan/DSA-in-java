package BasicJava.BinarySearch;

public class BinaraySearch {

    public static int binarysearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int high = arr.length - 1;
        if (high == 0) return -1;
        int low = 0;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }


        return -1;
    }


    // haaaaaaaaaaa the below code use extra sapce for
    // recursive calls hence above one is more optimize...
    public static int binarysearchrecursivly(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarysearchrecursivly(arr, low, mid - 1, target);
        else if (arr[mid] < target) return binarysearchrecursivly(arr, mid + 1, high, target);
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 18, 23, 35, 42, 56, 67, 89};
        System.out.println(binarysearch(arr, 18));
        System.out.println(binarysearchrecursivly(arr, 0, arr.length - 1, 18));

    }
}
