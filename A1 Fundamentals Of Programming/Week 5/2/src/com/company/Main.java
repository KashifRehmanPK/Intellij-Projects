package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        int a, sum = 0;
        System.out.println("sum of even number");
        for (a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }
        System.out.print(sum);






    }

}
