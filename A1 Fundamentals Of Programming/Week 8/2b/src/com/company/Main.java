package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        for(int i=0;i<=5;i++)
        {
            int randomNumber = (int) (Math.random()*(1000-6)) + 6;
            System.out.println(randomNumber);
        }

    }

}

