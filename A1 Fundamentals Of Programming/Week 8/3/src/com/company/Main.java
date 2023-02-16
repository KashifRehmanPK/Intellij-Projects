package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here

  //      while (true){
            System.out.println("number\t\t" + "frequency\t\t" + "histogram");
            int randomNumber = 0, i;
            int array[] = new int[1000];
            for (i = 0; i <= 999; i++) {
                randomNumber = (int) (Math.random() * (7 - 1)) + 1;
                //     System.out.println(randomNumber);
                array[i] = randomNumber;
            }
            func(array);
        }

        public static void func ( int array[]){
            int j = 0, i;
            for (i = 0; i <= 999; i++) {
                if (array[i] == 6) {
                    j++;
                }
            }
            int array2[] = new int[5];
            for (int m = 0; m <= 4; m++) {
                array2[m] = j;
            }
            function(array2);
        }
    //}

    public static void function(int array2[]) {
//        int j=500;
        for (int l = 0; l <= 4; l++) {
            System.out.print(l + "\t\t\t" + array2[l] + "\t\t\t\t" + " + ");

            for (int k = 150; k <= array2[l]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
