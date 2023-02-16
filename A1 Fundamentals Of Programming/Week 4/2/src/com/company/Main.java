package com.company;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);


        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            System.out.println("enter chracter is vowel");

            x = toUpperCase(x);
            System.out.println(x);
        }
        else{
            System.out.println("enter chracter is consonant");
        }


    }
}
