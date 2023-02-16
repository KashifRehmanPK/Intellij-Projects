package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int x,y,z,sum=0;
        x = sc.nextInt();
        for (y=1;y<=x;y++)
        {
            z= sc.nextInt();
            sum=sum+z;
        }
        System.out.println(sum);



    }
}
