package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner in = new Scanner(System.in);
        float array[] = new float[10];

        int i;
        for(i=0;i<=9;i++) {
            System.out.println("enter " + i + " number ");
            array[i] = in.nextInt();
        }
        for(i=0;i<=9;i++) {
            if (i%2==0) {
                System.out.print(i + "st number is ");
                System.out.println(array[i] + 5.5);
            }
        }

    }

}

