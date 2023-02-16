package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int bit[] = new int[8];
        if((x>=1)&&(x<=255))
        {
            double n = x/128;
            for(int i=0;i<=7;i++)
            {
                if (n >= 1)
                {
                    bit[i]=1;
                    n = n-1;
                }
                else
                {
                    bit[i]=0;
                }
                   n = n/0.5d;
                System.out.print(bit[i]);
                i++;
            }
        }




///////////////////// Second Methhod //////////////////////////////////////////////


 //       System.out.println(Integer.toBinaryString(x));


    }
}
