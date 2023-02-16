package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here



        int a = 5, b = 7;
        System.out.print("Sum of two number is ");
        sum(a, b);
        int value = sum(a, b);
        System.out.println(value);
    }

    static int sum(int numberOne, int numberTwo)
    {
        return (numberOne+numberTwo);
    }
}
