package Sorting;
public class mergesort {

    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left= new  int[n1];
        int[] right = new int[n2];
        for (int i = 0; i <n1 ; i++) {
           left[i]=arr[l+i];

        }
        for (int i = 0; i <n2 ; i++) {
           right[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=l;
        while (i<n1 && j< n2){
            if (left[i]<right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }


    public  static  void mergesortt(int[] arr,int l,int r){

        if (l>=r)return;
        int mid=(l+r)/2;
        mergesortt(arr,0,mid);
        mergesortt(arr,mid+1,r);
        merge(arr,l,mid,r);

    }


public  static void  displayArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
}
    public static void main(String[] args) {
        int[] arr = {3, 11,13, 9, 2};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        mergesortt(arr, 0, n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
