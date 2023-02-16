package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char grade = 0;

        if (num >= 0 && num <= 60) {
            grade = 'F';
        }
        else if (num >= 61 && num <= 70) {
             grade = 'D';
        }
        else if (num >= 71 && num <= 80) {
            grade = 'C';
        }
        else if (num >= 81 && num <= 90) {
            grade = 'B';
        }
        else if (num >= 91 && num <= 100) {
            grade = 'A';
        }

        int b;
             b = num % 10;
            System.out.println();

            if (b >= 1 || b <= 3) {
                System.out.print(grade + "-");
            }
        else if (b >= 4 || b <= 7) {
                System.out.print(" ");
            }
        else  if (b >= 8 || b <= 0) {
                System.out.print(grade + "+");
            }

    }

}

