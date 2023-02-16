package com.company;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc =new Scanner(System.in);
        int z;

        System.out.println("menu based calculator");
        System.out.println("""
                Addition +          '1'
                subtraction -       '2'
                multiplication *    '3'
                division /          '4'
                modulus %           '5'
                square root         '6'
                square x^2          '7'
                10 power x          '8'
                cube x^3            '9'
                x power 1/y         '10'
                x power y           '11'
                sine                '12'
                cosine              '13'
                tangent             '14'
                inverse of sine     '15'
                inverse of cosine   '16'
                inverse of tangent  '17'
                """);
        System.out.println("enter your choice");
        int choice = sc.nextInt();

        if (choice == 1) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x + y;
            System.out.println("addition of x and y is " + z);
        }
        else if (choice == 2)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x - y;
            System.out.println("suntraction of x and y is" + z);
        }
        else if (choice == 3)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x * y;
            System.out.println("multiplication of x and y is" + z);
        }
        else if (choice == 4)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x / y;
            System.out.println("divition of x and y is" + z);
        }
        else if (choice == 5)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x % y;
            System.out.println("modulus of x and y is" + z);
        }
        else if(choice == 6)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = (int) (sqrt(x));
            int b = (int)  (sqrt(y));
            System.out.println("square root of x and y is" + a);
            System.out.println("square root of x and y is" + b);
        }
        else if (choice == 7)
        {
            int x = sc.nextInt();
            z = x*x;
            System.out.println("sqare of x and y is" + z);
        }
        else if (choice == 8)
        {
            int x = sc.nextInt();
            z = (int) Math.pow(10,x);
            System.out.println("10 power x is" + z);
        }
        else if (choice == 9)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = x*x*x;
            int b = y*y*y;
            System.out.println("cube of x and y is" + a);
            System.out.println("cube of x and y is" + b);
        }
        else if(choice == 10)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            float a = (float) Math.pow(x,1/y);
            System.out.println("x power y is" + a);
        }
        else if(choice == 11)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = (int) pow(x,y);
            System.out.println("x power y is" + z);
        }
        else if (choice == 12)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double a = Math.sin(Math.toRadians(x));
            double b = Math.sin(Math.toRadians(y));
            System.out.println("sin of x is" + a);
            System.out.println("sin of y is" + b);
        }
        else if (choice == 13)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            int a = (int) Math.cos(Math.toRadians(x));
            int b = (int) Math.cos(Math.toRadians(y));
            System.out.println("cosin of x is" + a);
            System.out.println("cosin of y is" + b);
        }
        else if (choice == 14)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            int a = (int) Math.tan(Math.toRadians(x));
            int b = (int) Math.tan(Math.toRadians(y));
            System.out.println("tan of x is" + a);
            System.out.println("tan of y is" + b);
        }
        else if (choice == 15)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            int a = (int) Math.asin(Math.toRadians(x));
            int b = (int) Math.asin(Math.toRadians(y));
            System.out.println("asin of x is" + a);
            System.out.println("asin of y is" + b);
        }
        else if (choice == 16)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            int a = (int) Math.acos(Math.toRadians(x));
            int b = (int) Math.acos(Math.toRadians(y));
            System.out.println("cosine of x is" + a);
            System.out.println("cosine of y is" + b);
        }
        else if (choice == 17)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            int a = (int) Math.atan(Math.toRadians(x));
            int b = (int) Math.atan(Math.toRadians(y));
            System.out.println("atan of x is" + a);
            System.out.println("atan of y is" + b);
        }








    }
}
