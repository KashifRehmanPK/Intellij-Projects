package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a*a + b*b == c*c) {
            System.out.println("triangle is right triangle");
        }
        else if(a*a + b*b != c*c) {
                System.out.println("triangle is 'not' right triangle");
            }

        }
    }

