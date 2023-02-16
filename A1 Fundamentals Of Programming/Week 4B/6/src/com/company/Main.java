package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here





        Scanner sc=new Scanner(System.in);
        int Array[] = new int [3];
        int sum = 0;
        for(int i=0; i<3; i++){

            Array[i] = sc.nextInt();
            sum = sum + Array[i];
        }

        System.out.println(+sum);
    }
}
