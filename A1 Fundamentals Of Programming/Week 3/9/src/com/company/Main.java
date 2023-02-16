package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


       /* int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        temp=x;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");*/


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       /* int a = x/100;
        System.out.print(a + " ");
        int b = (x%100)/10;
        System.out.print(b + " ");
        int c = x%10;
        System.out.print(c + " ");*/


        System.out.println(x);
        int enteredNumber = x;
        int num = 0;
        String newNumber = "";
        while (x > 0) {
            num = x % 10;
            System.out.print(num);
            newNumber = newNumber + Integer.toString(num);
            x = x / 10;
        }
        System.out.println("New Number:" + newNumber);
        num = Integer.parseInt(newNumber);

        if (num == enteredNumber) {
            System.out.println("it is palindrome");
        }
        if (num != enteredNumber) {
            System.out.println("it is Not palindrome");
        }
    }
}

