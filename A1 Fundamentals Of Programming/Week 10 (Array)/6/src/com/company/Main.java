package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner in = new Scanner(System.in);
        int i;
        int array1[] = new int[10];
        for (i = 0; i <= 9; i++) {

            int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
//            System.out.println(randomNumber);
            array1[i] = randomNumber;

        }
        sum(array1);
    }
        public static void sum ( int array[]){
        int add=0;
       for(int j=0; j<=9; j++) {
           if (array[j] % 5 == 0) {
               add += array[j];
           }
       }
            System.out.println("After Adding all Multiple of 5 Elements In Array we get : " + add );

        }

    }





//            System.out.println(i);

//            System.out.println(i);

         /*   int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
//            System.out.println(randomNumber);
            array[i] = randomNumber;
            System.out.println(randomNumber);
        }*/
        /*System.out.println("-----------------result----------------------");
        for(int j=0; j<=9; j++)
        {
            System.out.println(array[j]);

        }*/
//            for (int j = 1; j <= 100; j++) {
//                if (i % 5 == 0) {
//                System.out.print(i + "st number is ");
//                    sum += i;
//                    System.out.println(sum);
//                    System.out.println(array[i]);











