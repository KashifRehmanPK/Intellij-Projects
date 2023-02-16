package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int r = 3;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= r; i++) {
            for (int j = i; j > r/3; j--) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i*2 ; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

