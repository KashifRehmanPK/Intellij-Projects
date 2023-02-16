package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Enter first and second params");
        Scanner s = new Scanner(System.in);
    for(int x=0;x<=1;x++){
        int first = s.nextInt();
        int second = s.nextInt();

        Calculator calculator = new Calculator();

        calculator.SetValues(first, second);
//        int area = calculator.Area();
//        System.out.println("Area = "+ area);

      /*  System.out.println("show first param value");
        System.out.println(calculator.GetFirstValue());
        System.out.println("Change first param value to 10");
        calculator.SetFirstValue(10);

        System.out.println("show first param value");
        System.out.println(calculator.GetFirstValue());
*/
//        int add = calculator.add(first, second);
//        System.out.println("add = "+ add);
//
//        int sub = calculator.sub(first, second);
//        System.out.println("sub = "+ sub);
//
//        int div = calculator.div(first, second);
//        System.out.println("div = "+ div);



    }
}
