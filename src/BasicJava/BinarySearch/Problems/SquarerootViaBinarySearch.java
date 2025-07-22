package BasicJava.BinarySearch.Problems;

public class SquarerootViaBinarySearch {

    public static int sqrtviabinary(int i) {

        if (i == 0) return 0;
        int low = 0;
        int high = i;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == i) return mid;
            else if (mid * mid < i) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(sqrtviabinary(67));
    }
}
