package BasicJava;

import java.util.Scanner;

public class pascaltriangle {
    static int[][] pascal(int n){
        int[][] ans=new int[n][];
        for (int i = 0; i <n; i++) {
            ans[i]= new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for (int j = 1; j <i ; j++) {
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        return ans;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of the rows:");
        int n= sc.nextInt();

        int[][] a=pascal(n);
      printMatrix(a);



    }
}
