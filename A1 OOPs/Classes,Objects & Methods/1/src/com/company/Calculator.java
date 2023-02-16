package com.company;

public class Calculator {

    public int first;
    public int second;

    Calculator(){

    }

    Calculator(int f, int s) {
        first = f;
        second =s;
    }

    public  void SetValues(int f, int s){
        first = f;
        second = s;
    }

    public  int GetFirstValue(){
        return  first;
    }

    public  void SetFirstValue(int f){
        first = f;
    }

    public  int Area(){
        return (first * second);
    }
//    public  int add(int a, int b){
//        return (a + b);
//    }
//
//    public  int sub(int a, int b){
//        return (a - b);
//    }
//
//    public  int div(int a, int b){
//        return (a / b);
//    }

}
