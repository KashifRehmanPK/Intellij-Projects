package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=90 && x<=100){
            System.out.println("a");
        }
        else if(x>=80 && x<=90){
            System.out.println("b");
        }
        else if(x>=70 && x<=80){
            System.out.println("c");
        }
        else if(x>=60 && x<=70){
            System.out.println("d");
        }
        else if(x>=50 && x<=60){
            System.out.println("e");
        }
        else {
            System.out.println("f");
        }



    }
}
