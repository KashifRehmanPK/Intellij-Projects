package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int a = sc.nextInt();
        modify(a);
        System.out.println("integer has been updated " + a);


    }

    static void modify(int z)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick from below\n1)add one\n2)minus one\n3)multiply one");
        int temp=sc.nextInt();

        if(temp==1)
            z=z+1;
        else if (temp == 2)
            z=z-1;
        else if(temp == 3)
            z=z*2;
    }




}
