package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int i = 0, j, sum1 = 0, sum2 = 0, AfterAdding = 0;
        System.out.println("FIRST ATTEMPT");
        int FirstDice = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Dice One: " + FirstDice);

        int SecondDice = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Dice Two: " + SecondDice);
        System.out.println("------------------------");

        System.out.println("SECOND ATTEMPT");
        int ThreeDice = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Dice One: " + ThreeDice);

        int FourDice = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Dice One: " + FirstDice);

        System.out.println("-------------------");


        sum1 = FirstDice + SecondDice;
        System.out.println("Sum of FirstThrow Is : " + sum1);
        sum2 = ThreeDice + FirstDice;
        System.out.println("Sum of SecondThrow Is : " + sum2);

        int y = sum1;


        function(sum1);
        if (sum2 == 7 && sum1 == 7) {
            System.out.println("You Lose");
        }
         else
         {
            AfterAdding = y + sum1;
            System.out.println("By Adding Send Value and Recieved Value We Get: " + AfterAdding);

         function(AfterAdding);
         }
    }
        public static int function(int s)
        {
        if(s==7 || s==11)
        {
            System.out.println("\nYou Win");
        }
        else if (s==2 || s==3 || s==12)
        {
            System.out.println("\nYou Lose");
            System.out.println("HOUSE Win");
        }
        else if(s==4 || s==5 || s==6 || s==8 || s==9 || s==10)
        {

            int array[] = {4, 5, 6, 8, 9, 10};
            for(int i=0;i<=5;i++) {

                if (s == array[i])
                    System.out.println("\nYou Recieved "+ s +" points");

            }
        }

            System.out.println("The value of s is: "+ s);

        return s;
    }

    public static void function2(int A)
    {
        if(A==7 || A==11)
        {
            System.out.println("\nYou Win");
        }
        else if (A==2 || A==3 || A==12)
        {
            System.out.println("\nYou Lose");
            System.out.println("HOUSE Win");
        }



        /*
        else if(A==4 || A==5 || A==6 || A==8 || A==9 || A==10)
        {

            int array[] = {4, 5, 6, 8, 9, 10};
            for(int i=0;i<=5;i++) {

                if (A == array[i])
                    System.out.println("\nYou Recieved "+ A +" points");
        */
            }
        }

//        System.out.println("The value of s is: "+ A);
