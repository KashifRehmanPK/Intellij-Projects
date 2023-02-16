package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int r = 3; r >= 1; r--) {

            for (int s = (1 - r); s >= 1; s--) {
                System.out.print(" ");
            }

            for (int c = r; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

