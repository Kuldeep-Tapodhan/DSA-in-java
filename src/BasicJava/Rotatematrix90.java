package BasicJava;

import java.util.Scanner;

public class Rotatematrix90 {

    public static void printMatrix(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transpose(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseRow(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate90(int[][] arr) {
        Transpose(arr);
        int rows = arr.length;
        for (int i = 0; i < rows; i++) {
            reverseRow(arr[i]);
        }
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

        System.out.println("Rotated Matrix is:");
        rotate90(arr);
        printMatrix(arr);

        sc.close();
    }
}