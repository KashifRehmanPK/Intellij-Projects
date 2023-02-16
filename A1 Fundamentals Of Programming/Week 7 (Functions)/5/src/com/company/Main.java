package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        pattern(r, c);

    }

    public static void pattern(int rows, int coloumns) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= coloumns; j++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
