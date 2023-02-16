package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int array[] = new int[10];

        int i = 0;
        for (i = 0; i <= 9; i++) {
            int x = in.nextInt();
            if ((x >= 10) && (x <= 100)) {

                array[i] =   x;
                if(array[i] ==  x)
                {

                }

                System.out.println("good number");
            } else {
                System.out.println("bad number");
            }
        }
    }
}




