package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integiers and one character");
        int x = sc.nextInt();
        int y = sc.nextInt();
        char s = sc.next().charAt(0);
        //        System.out.println("z = "+ s);
        int sum = x+y ;
        if (sum%2==0 && s == 'E'){
            System.out.print("sum is even");
        }
        else if(sum%2!=0 || s=='O' ){
            System.out.println("sum is ODD");
        }


    }
}

