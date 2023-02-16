package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here

        System.out.println("perfore function call");
        name();
        System.out.println("after function call");
    }

    static void name()
    {
        int x=5;
        for(int i=1;i<=5;i++)
        {
            System.out.println(x*i);
        }
    }
}
