package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ////////////                                   first topic


       /* int n;
        Scanner Sc = new Scanner(System.in);
        n = Sc.nextInt();
        if(n<5) {
             //statement(s) will execute if the boolean expression is true
            System.out.println("nsdfkvb");
        } else {
             //statement(s) will execute if the boolean expression is false
            System.out.println("sd.kfhga");

        }*/


        ///////////////   Switch


        ///////////////   Relational Operators
        ///////////////   (ARITHEMATIC)

        /*int a=10  ,b=20;

        System.out.println(a+b);

        System.out.println(a-b);

        System.out.println(a*b);

        System.out.println(a/b);

        System.out.println(a%b);       */


        ///////// Assignment Operators


     /*   int  a=10, b=20;
        System.out.println(a=b);

        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);*/


        ////////////   Coomparison Operators


       /* int a,b;
        Scanner Sc = new Scanner(System.in);
        a = Sc.nextInt();
        b = Sc.nextInt();

        if(a==b) {
            System.out.println("equal");
        }
        if(a!=b){
            System.out.println("not equal");
        }
        if(a<=b){
            System.out.println("GREATER");
        }
        if(a>=b){
            System.out.println("smaller");
        }
*/


        /////////// LOGIAL OPERATORS


/*
        int a=15,b=10;

            System.out.println(a>b && a>b);*/


     /*   int a=1,b=10;
            System.out.println(a>b  || a>b);*/



     /*   int a=1,b=10;
        System.out.println(a>b  != a>b);*/


        /////////////// ROWS AND COLUMNS



       /* for(int i=0; i<3; i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/


//////////////////////////////////////////////////////////////////////



        /*for(int i=0; i<3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/


        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

