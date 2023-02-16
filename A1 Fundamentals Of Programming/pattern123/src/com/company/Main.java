(package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int i, j, row = 5;
        for (i=0; i<row; i++)
        {
            for (j=2*(row-i); j>=0; j--)
            {
                System.out.print("");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
