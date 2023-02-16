import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("initial array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        for(int x=array.length;x>0;x--) {
            for (int y = 0; y < array.length-1; y++) {
                if (array[y] >= array[y + 1])
                {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
        System.out.println("");
        for (int z = 0; z <= 4; z++) {
            System.out.print(array[z]);
        }
    }
}
