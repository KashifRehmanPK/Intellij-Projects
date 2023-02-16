package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner sc = new Scanner(System.in);
        System.out.println("enter mobile model");
        int x = sc.nextInt();
        System.out.println("enter mobible price");
        int y = sc.nextInt();
        int totalprice = y;
        int sum=0;
        if (totalprice>5000){
            System.out.println("sale price after tax :");
            sum=totalprice*10/100;
            System.out.println(sum+y);
        }
        else if(totalprice<5000) {
            System.out.println("sale price after tax :");
            sum = totalprice * 5 / 100;
            System.out.println(sum + y);

        }




    }
}
