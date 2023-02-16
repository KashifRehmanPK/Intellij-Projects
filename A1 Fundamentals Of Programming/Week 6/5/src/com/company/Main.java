package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){

            if (x % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("this is a prime number");
        }
        else {
            System.out.println("this is a not prime number");
        }




    }
}
