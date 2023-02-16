package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("enter temp type");
        char choice;
        int tempF,tempC;
        Scanner sc = new Scanner(System.in);
        choice = sc.next().charAt(0);
        if((choice == 'f') || (choice == 'F'))
        {
            System.out.println("enter value in farenheight");
            double F = sc.nextInt();
            tempC = (int) ((F-32.0)*(5.0/9.0));
            System.out.println("the required temp in celcius is" + tempC);
        }
        else if((choice == 'C')||(choice == 'c'))
        {
            System.out.println("enter value in celcius");
            double C = sc.nextInt();
            tempF = (int) ((9.0/5)*(C+32));
            System.out.println("the required temp in farenheight is" + tempF);
        }
        else
        {
            System.out.println("invalied choice, you need to enter value in numbers");
        }





    }
}
