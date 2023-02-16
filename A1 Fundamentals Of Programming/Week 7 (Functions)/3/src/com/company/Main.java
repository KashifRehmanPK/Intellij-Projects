package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(integerPower(b,e));

    }
    public static int integerPower (int base, int exponent)
    {
        int result=1;
        while (exponent != 0) {
            result *= base;
            exponent--;
        }
        return result;
    }
}
