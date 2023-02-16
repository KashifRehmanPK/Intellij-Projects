import java.util.ArrayList;

public class Class2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum=0;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        for (int i = 0; i< list.toArray().length; i++){
            if(i%2!=0){
                sum = sum + list.get(i);
            }
        }
        System.out.println(sum);


    }
}
