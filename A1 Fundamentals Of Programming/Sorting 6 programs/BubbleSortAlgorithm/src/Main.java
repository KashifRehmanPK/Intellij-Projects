
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a[] = {7, 6, 3, 4, 1};
        int i = 3;
        while (i >= 0) {
            int j = 0;
            while (j <= i)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                j = j + 1;
            }
            i = i - 1;
        }
        for(int z=0;z<=4;z++) {
            System.out.print(a[z]);
        }
    }
}