package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x<0){
            System.out.println("error");
        }
        if(x>10){
            System.out.println("error");
        }
        else if (x%2==0){
            System.out.println("this is number even");
        }
        else {
            System.out.println("this is odd");
        }


    }
}
