package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (b % a== 0){
            System.out.println(a+b);
        }
        else{
            System.out.println(a*b);
        }
    }
}
