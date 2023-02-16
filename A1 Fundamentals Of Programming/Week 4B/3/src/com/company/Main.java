package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        int sum,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of books sold");
        int x = sc.nextInt();
        System.out.println("enter price per book");
        int y = sc.nextInt();
        int totalprice = x*y;
        System.out.println("total price is " + totalprice);
        if (totalprice>2000){
            System.out.println("discount price :");
            a=totalprice*10/100;
            System.out.println(sum=totalprice - a);

        }
        else if(totalprice<2000){
            System.out.println("discount price :");
            a=totalprice*5/100;
            System.out.println(sum=totalprice - a);


        }








    }
}
