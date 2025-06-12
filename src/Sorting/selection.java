package Sorting;

public class selection {
    public  static  void  selectionsort(int[] arr){
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min_ind=i;
            for (int j = i+1; j <n; j++) {
                if (arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array={2,9,3,7,5,3,8,4,5};
        selectionsort(array);
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
