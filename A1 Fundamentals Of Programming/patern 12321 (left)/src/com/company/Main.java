package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int r = 3;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");}
            for (int k = 1; k <= i; k++) {
                System.out.print("*");}
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = i; j <= r; j++) {
                System.out.print(" ");}
            for (int k = 1; k < i; k++) {
                System.out.print("*");}
            System.out.println();
        }
    }
}

