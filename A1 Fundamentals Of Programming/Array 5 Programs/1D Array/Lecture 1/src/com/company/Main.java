package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("what size of array you want to make?");
        int x = sc.nextInt();
        int array[] = new int[x];
        for(int i=0;i<=x-1;i++)
        {
            System.out.println("enter your marks " + i);         //////?????????????
            array[i] = sc.nextInt();

        }

        System.out.println("-----------result--------------");

        for(int i=0;i<=x-1;i++)
        {
            System.out.print("marks of student " + i + " are ");
            System.out.print(array[i] +"\n");

        }

    }
}
