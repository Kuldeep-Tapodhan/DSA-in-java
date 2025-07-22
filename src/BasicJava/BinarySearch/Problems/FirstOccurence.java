package BasicJava.BinarySearch.Problems;

public class FirstOccurence {


    public static int firstoccurance(int[] arr,int target){
        if (arr.length == 0) return -1;
        int high = arr.length - 1;
        int low = 0;
        int ans=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid]==target) {
                ans =mid;
                high = mid - 1;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3,4, 4, 4, 7, 9, 12, 12, 15};
        System.out.println(firstoccurance(arr,4));



    }
}
