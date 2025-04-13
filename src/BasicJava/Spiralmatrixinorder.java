package BasicJava;

import java.util.Scanner;

public class Spiralmatrixinorder {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void printSpiralOrder(int[][] matrix, int r, int c){
        int toprow=0,rightcolum=c-1,buttomrow=r-1,leftcolunm=0;

        int Elemetcount=0;

        while (Elemetcount <r*c){

            //top row print

            for (int i =leftcolunm; i <=rightcolum && Elemetcount<r*c; i++) {
                System.out.print(matrix[toprow][i]+" ");
                Elemetcount++;
            }
            toprow++;


            // right colum print

            for (int i =toprow ; i <=buttomrow && Elemetcount<r*c ; i++) {
                System.out.print(matrix[i][rightcolum]+" ");
                Elemetcount++;
            }
            rightcolum--;
            //right to left
            for (int i =rightcolum ; i >=leftcolunm && Elemetcount<r*c ; i--) {
                System.out.print(matrix[buttomrow][i]+" ");
                Elemetcount++;
            }
            buttomrow--;
            //buttom to top
            for (int i =buttomrow ; i >=toprow && Elemetcount<r*c; i--) {
                System.out.print(matrix[i][leftcolunm]+" ");
                Elemetcount++;
            }
            leftcolunm++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " values");
        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralOrder(matrix, r, c);
    }
    }

