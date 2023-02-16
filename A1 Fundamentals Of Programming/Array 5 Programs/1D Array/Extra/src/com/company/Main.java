package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        int[][] flats = new int[2][3];
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        flats[1][0] = 4;
        flats[1][1] = 5;
        flats[1][2] = 6;
        System.out.println("printing 2-D array");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }*/



        float [] rows = {1.0f,2.8f,3.7f,4.8f,5.4f};
        float sum = 0;
        for (float elements:rows){
            sum=sum+elements;
        }
        System.out.println(sum);







    }
}
