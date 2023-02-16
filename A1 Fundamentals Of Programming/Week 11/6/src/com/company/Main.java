package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        System.out.println("number\t\t\t" + "no. of times appeared\t\t\t" + "stars");

        Scanner in = new Scanner(System.in);
        int array[] = new int[36000];
        int i = 0, j, sum1 = 0, sum2 = 0, AfterAdding = 0;
        for (j = 0; j <= 35999; j++) {

     //       int FirstDice = ThreadLocalRandom.current().nextInt(5, 6) + 5;
     //       int SecondDice = ThreadLocalRandom.current().nextInt(5, 6) + 5;
            int FirstDice = (int) (Math.random() * (7 - 1) + 1);
            int SecondDice = (int) (Math.random() * (7 - 1) + 1);
            sum1 = FirstDice + SecondDice;
            array[j] = sum1;
        }
        function1(array);
    }

    public static void function1(int[] array) {

        int n = 0;
       for (int x = 1; x <= 12; x++) {
            n = x;
         int r = 0;
  //         for (n = 1; n <= 12; n++) {

               for (int y = 0; y <= 35999; y++) {
                   if (array[y] == n) {
                       r++;
                   }

               }
               histogram(r);
                // r++;

           }
          // r++;

       }

              /*  for (int a = 1; a <= r; a++) {
                    System.out.println("*");
                }
                System.out.println(n + "\t\t\t\t" + r+"\t\t\t\t\t\t\t\t\t");
*/



    public static void histogram(int r) {
  //      System.out.println("number\t\t" + "frequency\t\t" + "histogram");

        for (int l = 1; l <= 1; l++) {

            System.out.print(l + "\t\t\t\t" + r + "\t\t\t\t\t\t\t\t");

            for (int k = 1; k <= r; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}