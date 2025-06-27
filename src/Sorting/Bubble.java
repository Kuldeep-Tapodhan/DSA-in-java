package Sorting;

public class Bubble {


    public  static  void bubblesort(int[] array){

        int n=array.length;
        for (int i = 0; i <n-1 ; i++) {
            boolean flag=false;
            for (int j = 0; j <n-i-1 ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag==false)return;
        }
    }

    public static void main(String[] args) {
        int[] array={2,9,3,7,5,3,8,4,5};
        bubblesort(array);
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
