package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner in = new Scanner(System.in);
        int array[] = new int[5];

        for(int x=0;x<=4;x++)
        {
            int randomnumber = (int) (Math.random() * (10 - 1) + 1);
            array[x]=randomnumber;

        }
        for(int i=0;i<array.length;i++)
        {
            int flag = 0;
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(flag==0)
            {
                break;
            }
        }

        System.out.println(array);

    }
}
