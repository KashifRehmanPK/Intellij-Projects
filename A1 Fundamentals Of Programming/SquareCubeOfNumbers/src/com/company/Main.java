package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Number"+ "\t" + "Square"+ "\t" + "Cube");
        for(int i= 1; i<=10; i++)
        {
            System.out.print(i);
            System.out.print( "\t" + i*i);
            System.out.print("\t" + i*i*i ) ;
            System.out.println();
        }

    }
}
