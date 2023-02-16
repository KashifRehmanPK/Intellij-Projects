public class Main {
    public static void main(String[] args) {


        //Calculator obj1 = new Calculator(); // Object

        //System.out.println(obj1.GetFirstParam()); // o

        Calculator obj2=  new Calculator(2, 3);

        System.out.println(obj2.GetFirstParam()); // 2  (get first parameter)

        /// update obj2 param value
        obj2.SetFirstParam(5);

        System.out.println(obj2.GetFirstParam()); // 5   (get second parameter)

        // call obj2 action method
        System.out.println(obj2.Add());
    }
}