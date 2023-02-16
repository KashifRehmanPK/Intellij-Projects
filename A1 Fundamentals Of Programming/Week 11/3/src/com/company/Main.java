package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        char array1[] = new char[2];
        char array2[] = new char[2];
        System.out.println("enter 1st array");
        for(x=0;x<array1.length;x++)
        {
            array1[x] = in.next().charAt(0);
        }
        System.out.println("enter 2nd array");
        for(int y=0;y<array2.length;y++)
        {
            array2[y] = in.next().charAt(0);
        }
        String s1 = new String(array1);
        String s2 = new String((array2));

        System.out.println("first string ");
        System.out.println(s1);
        System.out.println("second string is");
        System.out.println(s2);
      /*  int a_l = array1.length;
        int b_l = array2.length;
        int c_l = a_l+b_l;
        int[] c = new int[c_l];
        for(int i=0;i<=array1.length;i++)
        {
            c[i]=array1[i];
        }
        for (int i=0;i<=array2.length;i++)
        {
            c[array1.length+i]=array2[i];
        }
        */

        //vowel(c[i]);
        vowel(s1,s2);

    }

    public static void vowel(String s1,String s2)
    {
        String s = s1 +"" + s2;
        System.out.println(s);

    }


}