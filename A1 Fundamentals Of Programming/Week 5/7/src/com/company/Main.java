package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        int num,s = 0;
        System.out.println("enter the number");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for (int i = 0; i < n; i++) {
            num = a.nextInt();
            if (num > s) {
                s = num;
            }
            System.out.println("the largest is:" + s);
        }
    }
}
