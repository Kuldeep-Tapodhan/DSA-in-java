package BasicJava;

import java.util.Scanner;

public class TransposeMatrix {

    // Helper method to print a matrix (outside main)
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Helper method to create the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        System.out.println("Enter Rows and Columns:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix is:");
        printMatrix(arr);

        // Create the transposed matrix
        int[][] transposedArr = transposeMatrix(arr);

        System.out.println("Transpose Matrix is:");
        printMatrix(transposedArr); // Use printMatrix to print the transposed matrix

        sc.close();
    }
}