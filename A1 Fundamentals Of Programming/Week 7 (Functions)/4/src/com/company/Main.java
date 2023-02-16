package com.company;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        main();
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base of right triangle");
         double base = sc.nextInt();
        System.out.println("enter hypotenuse of right triangle");
        double hypotenuse = sc.nextInt();


        double result = perpendicular(base, hypotenuse);
        System.out.println("length of the perpendicular of a right triangle is " + result);


    }
    public static double perpendicular(double base, double hypotenuse)
    {


        double perpendicular = hypotenuse + base;
        return perpendicular;

    }
}

