package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        int rows = 2;//in.nextInt();
        int columns =2;//in.nextInt();
        System.out.println();

        int[][] sum1 = new int[rows][columns];
        int[][] sum2 = new int[rows][columns];
        int[][] sum3 = new int[rows][columns];

        System.out.println("ENTER first matrix values");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                sum1[i][j] = in.nextInt();
            }
        }
        System.out.println("ENTER second matrix values");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                sum2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum3[i][j] = sum1[i][j]+sum2[i][j];
//                sum3[i][j] = sum1[0][i]+sum1[0][i];
            }
        }
        System.out.println("Sum matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum3[i][j]+ " ");
            }
            System.out.println();
        }





/*        int rows = 2, columns = 3;
        int[][] firstMatrix = {{2, 3, 4}, {5, 2, 3}};
        int[][] secondMatrix = {{-4, 5, 3}, {5, 6, 3}};


        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }


*/
    }
}


