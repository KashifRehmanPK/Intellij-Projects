package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        int n,sum=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<n;i++)
        {


            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum==n){
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not a perfect number");
        }








    }
}
