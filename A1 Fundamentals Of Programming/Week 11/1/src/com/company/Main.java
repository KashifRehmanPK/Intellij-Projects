package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        for (int x = 0; x <= 4; x++) {
            array[x] = in.nextInt();

        }
        histogram(array);
    }



    public static void histogram(int array[]) {
        System.out.println("number\t\t" + "frequency\t\t" + "histogram");
        for (int l = 0; l <= 4; l++) {

            System.out.print(l + "\t\t\t" + array[l] + "\t\t\t\t");

            for (int k = 1; k <= array[l]; k++) {
                if(l % 2 == 0)
                System.out.print("*");
                else {
                    System.out.print("+");
                }
            }
            System.out.println();

        }
    }
}
