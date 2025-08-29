package BasicJava;

public class SecondLargestElemt {

public static int secondlargest(int[] arr){
    int n=arr.length;
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    for (int i = 0; i <n ; i++) {
        if (arr[i]>first){
            second=first;
            first=arr[i];
        }
        else if (arr[i] > second && arr[i] < first) {
            second = arr[i];
        }

    }
    return second;
}



    public static void main(String[] args) {

    }
}
