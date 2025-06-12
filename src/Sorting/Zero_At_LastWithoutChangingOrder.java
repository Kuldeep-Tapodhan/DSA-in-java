package Sorting;

public class Zero_At_LastWithoutChangingOrder {

    static  void Zerolast(int[] arr){

        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]==0 && arr[j+1]!=0) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0,4,3,0,0,7,8,0};
        Zerolast(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }


}
