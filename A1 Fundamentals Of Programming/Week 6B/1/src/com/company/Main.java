package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();

        for (int i= 1; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
