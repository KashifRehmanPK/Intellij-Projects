package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Declaring the number
        int number = 145;

        separateDigits(number);
    }
    static void separateDigits(int n)
    {
        if (n < 10)
        {
           System.out.print(n + " ");
            return;
        }
        separateDigits(n / 10);
       System.out.print((n % 10) + " ");
    }
}
