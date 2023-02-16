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


    /////////////////////       array traversal        //////////////////////////////////////////////////////
    public static void table1(int number1) {
        if (number1 == 1) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " number of an array");
                firstArray[i] = in.nextInt();
            }
            for (i = 0; i <= 4; i++) {
                System.out.print("your " + i + " entered number is ");
                System.out.print(firstArray[i] + "\n");
            }
        }
    }

    ////////////////////    copy an array        //////////////////////////////////////////////////////


    public static void table2(int number2) {
        if (number2 == 2) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " number of an array");
                firstArray[i] = in.nextInt();
            }
            int secondArray[] = new int[5];
            for (i = 0; i <= 4; i++) {
                secondArray[i] = firstArray[i];
                System.out.print(secondArray[i]);
            }
        }
    }


    /////////////////  find element in array   //////////////////////////////////////////////////////

    public static void table3(int number3) {
        if (number3 == 3) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " number of an array");
                firstArray[i] = in.nextInt();
            }
            System.out.println("enter what you want to search");
            int x = in.nextInt();

            for (i = 0; i <= 4; i++) {
                if (firstArray[i] == x) {
                    System.out.println("entered number was found in location of " + i);
                }
            }


        }
    }

    ///////////// find max./min. element min array  /////////////////////////////////////////////////


    public static void table4(int number4) {
        if (number4 == 4) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i, maxNo = 0, minNo = 0;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " number of an array");
                firstArray[i] = in.nextInt();
            }
            for (i = 0; i <= 4; i++) {

                if (firstArray[i] >= maxNo) {
                    maxNo = firstArray[i];
                }

                if (firstArray[i] <= minNo) {
                    minNo = firstArray[i];
                }
            }
            System.out.println("maximum number entered is " +maxNo);
            System.out.println("minimum number entered is " +minNo);    //   ???????????????????????????????
        }
    }

////////////////   inverse of an array     ///////////////////////////////////////////////////////////////////

    public static void table5(int number5) {
        if (number5 == 5) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i;
            System.out.println("enter your number");
            for (i = 0; i <= 4; i++) {

                firstArray[i] = in.nextInt();
            }
            System.out.print("Reverse number is :");
            for (i = firstArray.length - 1; i >= 0; i--) {

                System.out.print(firstArray[i]);
            }
        }
    }


//////////////  reset an array    /////////////////////////////////////////////////////////////////

    public static void table6(int number6) {
        if (number6 == 6) {
            Scanner in = new Scanner(System.in);
            int firstArray[] = new int[5];
            int i, maxNo = 0, minNo = 0;
            for (i = 0; i <= 4; i++) {
                System.out.println("enter " + i + " number of an array");
                firstArray[i] = in.nextInt();
            }
            for (i = 0; i <= 4; i++) {
                firstArray[i] = 0;
                System.out.println(firstArray[i]);
            }
        }
    }




}

