package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int r = 2; r >= 0; r--) {
            for (int s = (2 - r); s >= 1; s--) {
                System.out.print(" ");
            }
            for (int c = r; c >= 1; c--) {
                System.out.print("*");
            }

            for (int c = r; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
