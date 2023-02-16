package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc =new Scanner(System.in);

        int f,s,sumpro=1;

        System.out.println("Please enter an integer: ");
        f = sc.nextInt();

        System.out.println("Please enter another integer less than the first integer: ");
        s= sc.nextInt();

        System.out.print("even Numbers: ");

        while(f<s) {
            if (f % 2 == 0) {
                System.out.print(" " + f);

                sumpro = sumpro * f;
            }

            f++;

        }

        System.out.println();
        System.out.print("Sum of Even Numbers: ");
        System.out.print(sumpro);




    }
}
