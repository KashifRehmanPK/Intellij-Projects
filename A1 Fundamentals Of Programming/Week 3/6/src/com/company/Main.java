package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        int num;
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
//            intArray[i]=a;
            if(a<=60){
                System.out.println("F");
            }
            if(a>60 && a<=70){
                System.out.println("D");
            }
            if(a>70 && a<=80){
                System.out.println("C");
            }
            if(a>80 && a<=90){
                System.out.println("B");
            }
            if(a>90 && a<=100){
                System.out.println("A");
            }








    }
}
