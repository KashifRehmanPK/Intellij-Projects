package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner in = new Scanner(System.in);
        char array[] = new char[5];
        for (int x = 0; x < array.length; x++) {
            array[x] = in.next().charAt(0);

        }
        vowel(array);
    }

    public static void vowel(char[] array) {

        int j = 0;

            for (int y = 0; y < array.length; y++) {

                if (array[y] == 'a' || array[y] == 'e' || array[y] == 'i' || array[y] == 'o' || array[y] == 'u') {
                    j++;
                }
            }
            System.out.println(j);
        }
    }

