package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;



public class Main {

    // Declaring the number
    int number = 110102;

    // Printing the last digit of the number
        while(number >0)

    {

        // Finding the remainder (Last Digit)
        int remainder = number % 10;

        // Printing the remainder/current last digit
        System.out.println(remainder);

        // Removing the last digit/current last digit
        number = number / 10;
    }
  /*  private static void printhello(int n) {


        int n = 5 ;
        void printhello (int n){
            if (n == 0) {
                return;
            }
            System.out.println("hello");
            printhello(n - 1);
        }
    }*/






        /*int n;
        System.out.println("enter the number");
        Scanner r  = new Scanner(System.in);
        n=r.nextInt();
        for (int i=0;i<=n;i=i+2){
            System.out.println(i);
        }*/




  /*int n;
    System.out.println("enter number");
    Scanner r = new Scanner(System.in);
    n=r.nextInt();
    for (int i=1;i<=n;i=i+2){
        System.out.println(i);
    }*/



        /*int a,b,sum;
        System.out.println("enter two numbers");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        sum = a+b;
        System.out.println(sum);*/










       /* while (true) {
            int a = 0, x, y, b, sum, sub, multiplication, divition;
            System.out.println("==============================");
            System.out.println("welcome to my calculator");
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for divition");
            System.out.println("press 5 to exit");

            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            //System.out.println("you enter:"+ a);

            if (a == 1) {
                Scanner r = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = r.nextInt();
                System.out.println("print 2nd number");
                y = r.nextInt();
                sum = x + y;
                System.out.println("Ans: "+ sum);
            }
            if (a == 2) {
                Scanner s = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = s.nextInt();
                System.out.println("enter 2st number");
                y = s.nextInt();
                sub = x - y;
                System.out.println("Ans: "+sub);
            }
            if (a == 3) {
                Scanner t = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = t.nextInt();
                System.out.println("enter 2st number");
                y = t.nextInt();
                multiplication = x * y;
                System.out.println("Ans: "+multiplication);
            }
            if (a == 4) {
                Scanner u = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = u.nextInt();
                System.out.println("enter 2st number");
                y = u.nextInt();
                divition = x / y;
                System.out.println("Ans: "+divition);
            }
            if (a == 5) {
                break;
            }
        }*/


    //                                           PROBLEM 1
           /* for(int i=1;i<=100;i++){
                System.out.println(i);
            }}}*/


    //                                           PROBLEM 2


        /*for(int i=100;i>=1;i--){
            System.out.println(i);
        }}}*/


    //                                          PROBLEM 3


       /* String a;
        String name;
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println(b);
    }}*/

    //                                          PTOBLEM 4




       /*int i;
        for(i=1;i<=10;i--){
            int a = 0, x, y, b, sum, sub, multiplication, divition;
            System.out.println("==============================");
            System.out.println("welcome to my calculator");
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for divition");
            System.out.println("press 5 to exit");

            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            //System.out.println("you enter:"+ a);

            if (a == 1) {
                Scanner r = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = r.nextInt();
                System.out.println("print 2nd number");
                y = r.nextInt();
                sum = x + y;
                System.out.println("Ans: "+ sum);
            }
            if (a == 2) {
                Scanner s = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = s.nextInt();
                System.out.println("enter 2st number");
                y = s.nextInt();
                sub = x - y;
                System.out.println("Ans: "+sub);
            }
            if (a == 3) {
                Scanner t = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = t.nextInt();
                System.out.println("enter 2st number");
                y = t.nextInt();
                multiplication = x * y;
                System.out.println("Ans: "+multiplication);
            }
            if (a == 4) {
                Scanner u = new Scanner(System.in);
                System.out.println("enter 1st number");
                x = u.nextInt();
                System.out.println("enter 2st number");
                y = u.nextInt();
                divition = x / y;
                System.out.println("Ans: "+divition);
            }
            if (a == 5) {
                break;
            }
        }}}*/


    //                                                 PROBLEM 5


        /*int a, b;
        String s = "squareroot";
        Scanner sc = new Scanner(System.in);
        {
            a = sc.nextInt();
            b = a^2*1/2;

        }
        System.out.println(b);
    }}*/

    //package MyPackage;
    //public class SquareRoot


   /* public static double square(double number) {
        double t;
        double squareroot = number / 2;
        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return squareroot;
    }

    public static void main(String[] args) {
        double number = 16;
        double root;
     //   root = square(number);
        System.out.println("Number : " + number);
        System.out.println("Square Root : " + root);
    }

}

*/

//                                           PROBLEM 6


     /*   for (int i = 1; i <= 10; i++) {
            if (i == 6) continue;
            System.out.println(i + " ");
        }

    }*/


//                                             PROBLEM 7


       /* while (true){
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter score: ");
        num = reader.nextInt();
            if (num == 0) {
                break;
            }
        if (num >= 50) {
            System.out.println("Pass!");
        } else
            System.out.println("Fail!");

        }
    }}*/

//                                             PROBLEM 8


       /* System.out.println("welcome");
        System.out.println("to");
        System.out.println("java");
    }}*/


//                                              problem 9
        /*double b = 0,sum, sub;
        float a = 0f;
        System.out.println("welcome");
        System.out.println("to add press 1 and to sub press 2");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("enter two numbers");

            a = sc.nextFloat();
            b = sc.nextDouble();
            sum = a + b;
            System.out.println("your answer is  :" + sum);
        }
        if (a == 2) {
            System.out.println("enter two numbers");

            a = sc.nextFloat();
            b = sc.nextDouble();
            sub = a - b;
            System.out.println("your answer is  :" + sub);
        }}}*/


//                                          PROBLEM 10



        /*String str = "Hello World";
        int count = 0;
        System.out.println("The entered string is: "+str);
        //Count the characters in the string except space
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
                count++;
        }
        //Displays the total number of characters in the string
        System.out.println("Total number of characters in the string: " + count);
    }}*/


}}