package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integiers and one character");
        int x = sc.nextInt();
        int y = sc.nextInt();
        char b = sc.next().charAt(0);

        if (b=='s' || b=='S')
        {
            System.out.println("The Sum is " + (x+y));
        }

        else if (b == 'p' || b=='P')
        {
            System.out.println("The product is " + (x*y));
        }














    }
}
