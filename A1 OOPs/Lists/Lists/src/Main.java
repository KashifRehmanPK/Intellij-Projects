import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");


/*
Question:
        interger list;
        10 names of countries;
        print names written at even location;
        add number written at even location;
*/

        ArrayList<String> list = new ArrayList<String>();

        list.add("pakistan");
        list.add("america");
        list.add("UK");
        list.add("egypt");
        list.add("india");
        list.add("china");
        list.add("south africa");
        list.add("japan");
        list.add("turkey");
        list.add("brazil");


        for (int i = 0; i< list.toArray().length; i++){
           if(i%2!=0){
               System.out.println(list.get(i));
           }

        }


    }
}