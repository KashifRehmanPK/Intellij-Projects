package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int randomNumber = 0;
        int array[] = new int[10];
        System.out.println("elements\t\t" + "values\t\t" + "histogram\t\t");
        for (int i = 0; i <= 9; i++) {
            randomNumber = (int) (Math.random() * (20 - 1)) + 1;
            array[i] = randomNumber;

        }
        function(array);
    }
    public static void function(int array[])
    {
        for(int i=0;i<=9;i++)
        {
            System.out.print(i+"\t\t\t\t"+array[i] + "\t\t\t");
            for(int j=0;j<=array[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

        /*Scanner scan = new Scanner(System.in);
        int[] nums = new int[101];
        System.out.println("Enter numbers between 1 and 100[-1 to quit]: ");
        int num = scan.nextInt();
        int base10 = 0;
        while (num != -1) {
            nums[num]++;
            num = scan.nextInt();
        }
        for (int count = 1; count <= 100; count += 10) {
            System.out.print(count + " - " + (base10 += 10) + "  | ");

            for (int index = count; index <= base10; index++) {
                while (nums[index] > 0) {
                    System.out.print("*");
                    nums[index]--;
                }
            }
            System.out.println();
        }*/

