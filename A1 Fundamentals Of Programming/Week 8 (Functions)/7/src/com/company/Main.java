package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        double firstD, secD, thirdD;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first driver driving hours");
        firstD = in.nextDouble();
        System.out.println("Enter second driver driving hours");
        secD = in.nextDouble();
        System.out.println("Enter third driver driving hours");
        thirdD = in.nextDouble();


        System.out.println("Car\t\t" + "Hours\t\t" + "Charges");
        double ans = CalculateCharge(firstD);
        System.out.println("0"+ "\t\t"+ firstD + "\t\t"+ ans);
        double ans2 = CalculateCharge(secD);
        System.out.println("0"+ "\t\t"+ secD + "\t\t"+ ans2);
        double ans3 = CalculateCharge(thirdD);
        System.out.println("0"+ "\t\t"+ thirdD + "\t\t"+ ans3);
    }

    public static double CalculateCharge(double hours) {
        double charge = 0;
        if (hours <= 3)
            charge = 2;
        else if (hours > 3 && hours <= 24) {
            charge = 2 + ((hours - 3) * (.5));
            if (charge > 10)
                charge = 10;
        }
        //System.out.print("\t\t\t\t\t" + charge);

        return charge;
    }

}





 /*System.out.println("number\t\t"+"frequency\t\t"+"histogram");
         int randomNumber=0;
         int array[]= new int[6];
         for (int i = 0; i <= 5; i++) {
         randomNumber = (int) (Math.random() * (1000 - 6)) + 6;
         //     System.out.println(randomNumber);
         array[i]=randomNumber;

         }
         function(array);
         }


public static void function(int array[])
        {
        for (int j = 0; j <= 5; j++)
        {
        System.out.print(j + "\t\t\t" +array[j]+"\t\t\t\t"+" + ");
        for(int k=150;k<=array[j];k++)
        {
        System.out.print("*");
        }
        System.out.println();
        }
        }*/


























/*

        Scanner in = new Scanner(System.in);

        int x, HoursPerDay, HalfHour;

        System.out.println("Enter Number of hours ");
        x = in.nextInt();

        if(x==0.5)
            System.out.println(x*0.5);

        else if(x==1)
            System.out.println(x*1);
*/

        /*for(int i=0;i<=3;i++)
        {
            System.out.println(i + "\t\t");

        }*/

