package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int x = sc.nextInt();
        number(x);
        int prime = number(x);
        if(prime==2)
        {
            System.out.println("entered number is prime");
        }
        else
        {
            System.out.println("entered number is not prime");
        }
    }
    public static int number(int y)
    {
        int count=0;
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            {
                count++;
            }
        }
        return count;
    }


}
