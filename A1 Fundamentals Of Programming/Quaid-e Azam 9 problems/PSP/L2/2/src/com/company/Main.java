package com.company;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        float y = sc.nextInt();
        float z = sc.nextInt();
        System.out.println("%d  %.1f"+ sqrt(x) + " " + sqrt(y) + " " + sqrt(z));




    }
}
