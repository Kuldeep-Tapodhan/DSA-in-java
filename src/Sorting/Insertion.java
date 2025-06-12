package Sorting;

public class Insertion {


    static  void  insertionsort(int[] arr){
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){//to make it sorting in decreasing order just change
                int temp=arr[j]; //arr[j]>arr[j-1] in above line
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={4,3,7,8,6,9,2,1,10};
        insertionsort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
