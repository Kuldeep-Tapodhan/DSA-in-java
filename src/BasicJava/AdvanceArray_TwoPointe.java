package BasicJava;

public class AdvanceArray_TwoPointe {




    public  static void  SortZeroesandones(int arr[]){

        int n= arr.length;
        int zeros=0;

        for (int i = 0; i <n ; i++) {
            if (arr[i]==0){
                zeros++;
            }
        }
        //0 to zeroes-1   and   zero to n

        for (int i = 0; i <zeros ; i++) {
            arr[i]=0;
        }
        for (int i =zeros; i <n ; i++) {
            arr[i]=1;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public  static  void evenFirstOddLast(int[] arr){
            int n=arr.length;
            int left=0;
            int right=n-1;

    }


    public static void main(String[] args) {

        int arr[]={1,1,1,0,0,0,1,0,1,0,0,1};
        SortZeroesandones(arr);

    }
}
