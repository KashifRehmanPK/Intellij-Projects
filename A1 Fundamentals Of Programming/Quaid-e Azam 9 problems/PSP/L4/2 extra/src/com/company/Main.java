package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here(



        Scanner sc = new Scanner(System.in);
        int MonthlyIncome = sc.nextInt();
        int AnnualIncome;
        float tax;
        System.out.println("enter monthly income");
        AnnualIncome= 12*MonthlyIncome;
        if(AnnualIncome<250000)
        {
            tax=0;
            System.out.println("tax on annual income " + AnnualIncome + "is" + tax);
        }
        else if((AnnualIncome>250000)&&(AnnualIncome<600000))
        {
            tax = (float) ((5.0/100)*AnnualIncome);
            System.out.println("the tax on AnnualIncome" + AnnualIncome + "is" + tax);
        }
        else if ((AnnualIncome>=600000)&&(AnnualIncome<1000000))
        {
            tax= (float) ((10.0/100)*AnnualIncome);
            System.out.println("the tax on AnnualIncome" + AnnualIncome + "is" + tax);
        }
        else if((AnnualIncome>=1000000)&&(AnnualIncome<2500000))
        {
            tax = (float) ((15.0/100)*AnnualIncome);
            System.out.println("the tax on AnnualIncome" + AnnualIncome + "is" + tax);
        }
        else if((AnnualIncome>=2500000)&&(AnnualIncome<5000000))
        {
            tax = (float) ((20.0/100)*AnnualIncome);
            System.out.println("the tax on AnnualIncome" + AnnualIncome + "is" + tax);
        }
        else
        {
            tax = (float) ((25.0/100)*AnnualIncome);
            System.out.println("the tax on AnnualIncome" + AnnualIncome + "is" + tax);
        }






    }
}
