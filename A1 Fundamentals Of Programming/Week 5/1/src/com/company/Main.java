package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("multiples of 5");
        for ( a= 1; a <= 100; a++) {
            if (a % 5 == 0)
                System.out.print(a + "  ");
        }
        System.out.println("\n\nmultiples of 3");

                for (a = 1; a < 100; a++) {
                    if (a % 3 == 0)
                        System.out.print(a + "  ");
                    }




    }
}
