package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("01 array traversal\n" + "02 copy an array\n" + "03 finding an element in array\n" + "04 finding min and max element in array\n" + "05 inverse of arraqy\n" + "06 reset an array\n");
        System.out.println("select you option");
        int x = sc.nextInt();

        table1(x);
        table2(x);
        table3(x);
        table4(x);
        table5(x);
        table6(x);

    }

    ////////      array treversal    /////////////////////////////////////////////////////////////////////
    public static void table1(int enterNumber1) {

        if (enterNumber1 == 1) {
            Scanner sc = new Scanner(System.in);
            int firstarray[] = new int[5];
            for (int i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " elements of an array");
                firstarray[i] = sc.nextInt();
            }
            for (int i = 0; i <= 4; i++) {
                System.out.print("your " + i + " number is ");
                System.out.print(firstarray[i] + "\n");
            }
        }

    }
    //   copy an array   ////////////////////////////////////////////////////////////////////////

    public static void table2(int enterNumber2) {
        if (enterNumber2 == 2) {
            Scanner sc = new Scanner(System.in);
            int firstArray[] = new int[5];
            for (int i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " elements of an array");
                firstArray[i] = sc.nextInt();
            }

            int secondArray[] = new int[5];
            for (int x = 0; x <= 4; x++) {
                System.out.println("enter " + x + " elements of an array");
                if (firstArray[x] == secondArray[x]) {
                    System.out.println(secondArray);
                }


            }
        }
    }


    ///////////////     find an element in array ///////////////////////////////////////////

    public static void table3(int enterNumber3) {
        if (enterNumber3 == 3) {
            Scanner sc = new Scanner(System.in);
            int firstArray[] = new int[5];
            for (int i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " elements of an array");
                firstArray[i] = sc.nextInt();
            }

            System.out.println("enter what you want to search ");
            int x = sc.nextInt();

            for (int i = 0; i <= 4; i++) {
                if (firstArray[i] == x) {
                    System.out.println("x found at index " + i);
                }

            }
        }
    }


    ///////////      find min. / max. element in array         /////////////////////////////////////////

    public static void table4(int enterNumber4) {
        int maxNo = 0;
        int minNo = 0;
        if (enterNumber4 == 4) {
            Scanner sc = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i = 0;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " elements of an array");
                firstArray[i] = sc.nextInt();
            }
            for (i = 0; i <= 4; i++) {
                if (firstArray[i] > maxNo) {
                    maxNo = firstArray[i];
                }
                if (firstArray[i] < minNo) {
                    minNo = firstArray[i];
                }
            }
            System.out.println("max no entered is " + maxNo);

            System.out.println("min no entered is " + minNo);


        }
    }
    /////////////////////////       inverse of an array            /////////////////////////////////

    public static void table5(int enterNumber5) {

        if (enterNumber5 == 5) {
            Scanner sc = new Scanner(System.in);
            int firstArray[] = new int[5];

            System.out.println("enter elements of an array");
            for (int i = 0; i <= 4; i++) {
                firstArray[i] = sc.nextInt();
            }
            for (int i = firstArray.length - 1; i >= 0; i--) {
                System.out.print(firstArray[i]);
            }
        }
    }



/*
    public static void table5(int enterNumber5) {

        if (enterNumber5 == 5) {
            int firstArray[] = {1,2,3,4,5};
            for (int i = 0; i <= 4; i++)
            {
                System.out.print(firstArray[i]);

            }
            System.out.println();

            for (int i = firstArray.length-1; i >= 0; i--)
            {
                System.out.print(firstArray[i]);
            }
        }
    }
*/

/////////////////////// Reset an array (or) Delete all elements of an array ///////////////////////////////////////


    public static void table6(int enterNumber6) {

        if (enterNumber6 == 6) {
            Scanner sc = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i = 0;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " elements of an array");
                firstArray[i] = sc.nextInt();
            }
            for (i = 0; i <= 4; i++) {
                firstArray[i] = 0;
                System.out.println(firstArray[i]);

            }
        }
    }










            }

