package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here










        System.out.println("welcome to pakistan mobile world");
        System.out.println("select one mobile operator from below");
        System.out.println("enter 1 for mobilink");
        System.out.println("enter 2 for ufone");
        System.out.println("enter 3 for warid");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int y;
        if (x == 1) {
            System.out.println("enter 1 for pre-paid");
            System.out.println("enter 2 for post-paid");
            y = sc.nextInt();

            if(y==1) {
                System.out.println("select Mobilink Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  = 50 min & 50 sms");

                }
                if (z==2){
                    System.out.println("you selected package 2  = 100 min & 100 sms");
                }
                System.out.println("you selected mobilink");
                System.out.println("thank you for choseing mobilink pre-paid");
                System.out.println();
            }
            if(y==2) {
                System.out.println("select Mobilink Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  = 50 min & 50 sms");
                }
                if (z==2){
                    System.out.println("you selected package 2  =  100 min & 100 sms");
                    System.out.println("");
                }
                System.out.println("you selected ufone");
                System.out.println("thank you for choseing mobilink pos-paid");
                System.out.println();
            }

        }

        else if (x == 2) {
            System.out.println("enter 1 for pre-paid");
            System.out.println("enter 2 for post-paid");

            y = sc.nextInt();

            if(y==1) {
                System.out.println("select ufone Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  =  50 min & 50 sms");
                }
                if (z==2){
                    System.out.println("you selected package 2  =  100 min & 100 sms");
                }
                System.out.println("you selected ufone");
                System.out.println("thank you for choseing ufone pre-paid");
                System.out.println();
            }
            if(y==2) {
                System.out.println("select ufone Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  =  50 min & 50 sms");
                }
                if (z==2){
                    System.out.println("you selected package 2  =  100 min & 100 sms");
                }
                System.out.println("you selected ufone");
                System.out.println("thank you for choseing ufone pre-paid");
                System.out.println();
            }


        }
        else if (x == 3) {
            System.out.println("enter 1 for pre-paid");
            System.out.println("enter 2 for post-paid");

            y = sc.nextInt();

            if(y==1) {
                System.out.println("select warid Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  =  50 min & 50 sms");
                }
                if (z==2){
                    System.out.println("you selected package 2  =  100 min & 100 sms");
                }
                System.out.println("you selected warid");
                System.out.println("thank you for choseing warid pre-paid");
                System.out.println();
            }
            if(y==2) {
                System.out.println("select warid Packages");
                System.out.println("package 1   =   50 min & 50 sms");
                System.out.println("package 2   =   100 min & 100 sms");
                int z = sc.nextInt();

                if(z==1) {
                    System.out.println("you selected package 1  =  50 min & 50 sms");
                }
                if (z==2){
                    System.out.println("you selected package 2  =  100 min & 100 sms");
                }
                System.out.println("you selected warid");
                System.out.println("thank you for choseing warid pos-paid");
                System.out.println();
            }


        }
    }
}
