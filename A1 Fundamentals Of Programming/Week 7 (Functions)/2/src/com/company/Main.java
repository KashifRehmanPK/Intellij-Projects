package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();

        System.out.println(abc(a, b));
    }

    public static int abc(int a, int b) {

        if (a % b != 0) {
            return a + b;
        } else {
            int sum = a * b;
            return sum;

        }
    }
}

