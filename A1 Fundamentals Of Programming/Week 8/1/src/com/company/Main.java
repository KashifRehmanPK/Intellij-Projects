package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        int i;

        for (i = 1; i <=20; i++) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            funtion(x);

        }
}

    private static void funtion(int seed)
    {
        int randomNumber = (int) (Math.random() * (50 - seed)) + seed;
        System.out.println(randomNumber);
    }

}
