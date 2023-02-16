package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        int sum = 0;
        for(int i=0;i<=9;i++)
        {
            System.out.println("enter " + i + " number ");
            array[i]= in.nextInt();
            sum =sum + array[i];
        }
        System.out.println(sum);
    }
}
