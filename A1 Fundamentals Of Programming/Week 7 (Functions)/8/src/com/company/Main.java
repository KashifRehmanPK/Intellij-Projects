package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int number) {

        int rev_num = 0;
        while (number > 10) {
            rev_num = number % 10;
            number = number / 10;
            System.out.print(rev_num);
        }
    }
}