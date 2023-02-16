public class Main {
    public static void main(String[] args) {


        //ANDROID//////////////////////////////////////////////////////////
        Class2 samsung = new Class2();
        int x = samsung.nextInt();

        double width = 6.98;
        double height = 13.6;
        String os = "Android";
        double price = 1000;
        if (x == 1) {
            int call = samsung.call();

        }
        if (x == 2) {
            int sendMessage = samsung.sendMessage();

        }



        //IPHONE/////////////////////////////////////////
        Class2 iphone = new Class2();
        double w = 6.98;
        double h = 13.6;
        String OS = "Android";
        double p = 1000;
        if (x == 6) {
            int c = samsung.C();

        }
        if (x == 7) {
            int SM = samsung.SM();

        }
    }
}
