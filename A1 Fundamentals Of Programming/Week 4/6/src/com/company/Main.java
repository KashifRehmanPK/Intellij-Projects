package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x/100;
        System.out.print(a + " ");
        int b = (x%100)/10;
        System.out.print(b + " ");
        int c = x%10;
        System.out.print(c + " ");




        }
    }


