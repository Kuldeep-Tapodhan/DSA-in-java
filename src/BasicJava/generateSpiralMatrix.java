package BasicJava;
import java.util.Scanner;
public class generateSpiralMatrix {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralMatrix(int n){
        int toprow=0,rightcolum=n-1,buttomrow=n-1,leftcolunm=0;

        int inserteelemt=1;
        int[][] matrix= new int[n][n];
        while (inserteelemt <= n*n){

            //top row print

            for (int i =leftcolunm; i <=rightcolum && inserteelemt <= n*n; i++) {
                matrix[toprow][i]=inserteelemt++;
            }
            toprow++;
            // right colum print
            for (int i =toprow ; i <=buttomrow && inserteelemt <= n*n ; i++) {
                matrix[i][rightcolum]=inserteelemt++;
            }
            rightcolum--;
            //right to left
            for (int i =rightcolum ; i >=leftcolunm && inserteelemt <= n*n ; i--) {
                matrix[buttomrow][i]=inserteelemt++;
            }
            buttomrow--;
            //buttom to top
            for (int i =buttomrow ; i >=toprow && inserteelemt <= n*n; i--) {
                matrix[i][leftcolunm]=inserteelemt++;
            }
            leftcolunm++;
        }
        return  matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}