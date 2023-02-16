package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc= new Scanner(System.in);
        int sale, commission, earn;
        while (true) {
            System.out.println("Enter Sales in Dollars");
            sale = sc.nextInt();
            if (sale == -1) {
                break;
            }
            commission = sale / 100 * 9;
            earn = commission + 200;
            System.out.println("Salary is: "+ earn + "$" );


        }
    }
}
