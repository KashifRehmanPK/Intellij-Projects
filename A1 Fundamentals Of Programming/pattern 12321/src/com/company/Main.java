package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("*");
        for(int r=3;r>=1;r--){
            for(int c=r;c>=1;c--){
                System.out.print("*");
            }
            System.out.println();
            for(int c=r;c>=1;c--){
                System.out.print("*");
            }
        }

    }
}
