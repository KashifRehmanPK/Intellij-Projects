package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner sc= new Scanner(System.in);
        System.out.println("enter three values");
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        if ((numA>numB)&&(numA>numC))
        {
            System.out.println("the max number out of numA ,numB,numC numA");
        }
        else if((numB>numA)&&(numB>numC))
        {
            System.out.println("the max number out of numA ,numB,numC numB");
        }
        else
        {
            System.out.println("the max number out of numA ,numB,numC numC");
        }







    }
}
