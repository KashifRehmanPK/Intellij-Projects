package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        int total=0,percentage;
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int name[]=new int[3];
        for(int i=0;i<=3;i++){

            System.out.println(name[x]);
        }
        total+=name[x];
        percentage = (x/total)*100;
        if (percentage<=50){
            System.out.println("f");
        }
        else if (percentage>=50 && percentage<=60){
            System.out.println("e");
        }
        else if (percentage>=60 && percentage<=70){
            System.out.println("d");
        }
        else if (percentage>=70 && percentage<=80){
            System.out.println("c");
        }
        else if (percentage>=80 && percentage<=90){
            System.out.println("b");
        }
        else if (percentage>=90 && percentage<=100){
            System.out.println("a");
        }




    }
}
