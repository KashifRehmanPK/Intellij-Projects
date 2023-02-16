package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner in = new Scanner(System.in);
        int i;
        int array1[] = new int[50];

        int randomNumber = 0;
        int search = 0;

        for (i = 0; i <= 49; i++) {
            randomNumber = (int) (Math.random() * (200 - 1)) + 1;
            array1[i] = randomNumber;
            System.out.println(randomNumber);

        }
        System.out.print("Enter your number : ");
        search = in.nextInt();

        System.out.println();

        System.out.println("The number you enter is  " + search + "\n");

        function(search, array1);

    }

    public static void function(int s, int[] array1) {

        for (int i = 0; i <= 49; i++) {
            if (array1[i] == s) {
                System.out.println("we found your number at index of : " + i);
            }
        }
        System.out.println("\n" + "----------------------The End-------------------------");
    }
}








