import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

//Samsung
        androoidandIOS samsung = new androoidandIOS();
        samsung.setWidth(6.98);
        samsung.setHeight(13.6);
        samsung.setOS("Android");
        samsung.setBrand("Samsung");
        samsung.setPrice(1000);

        System.out.println("width of samsung is " + samsung.getWidth());
        System.out.println("height of samsung is " + samsung.getHeight());
        System.out.println("OS is " + samsung.getOS());
        System.out.println("Brand of samsung is " + samsung.getBrand());
        System.out.println("Price of samsung is " + samsung.getPrice());


//Iphone
        androoidandIOS Iphone = new androoidandIOS();
        Iphone.setWidth(5.86);
        Iphone.setHeight(12.3);
        Iphone.setOS("IOS");
        Iphone.setBrand("Apple");
        Iphone.setPrice(1200);

        System.out.println("Width of iphone is " + Iphone.getWidth());
        System.out.println("heitht of iphone is " + Iphone.getHeight());
        System.out.println("OS is " + Iphone.getOS());
        System.out.println("Brand of iphone is " + Iphone.getBrand());
        System.out.println("price of iphone is " + Iphone.getPrice());


        System.out.println("enter 1 for samsung and 2 for iphone");

        System.out.println("Enter the function you want to perform");
        System.out.println("1) call()");
        System.out.println("2) sendmessage()");
        System.out.println("3) browse()");
        System.out.println("4) share()");


//sumsung

        int y = in.nextInt();
        int x = in.nextInt();


        if (y == 1) {
            System.out.println("samsung");
            if (x == 1) {
                System.out.println("Calling");
            }
            if (x == 2) {
                System.out.println("sending Message");
            }
            if (x == 3) {
                System.out.println("browsing");
            }
            if (x == 4) {
                System.out.println("shareing");
            }
        }


//iphone
        if (y == 2) {
            System.out.println("iphone");
            if (x == 1) {
                System.out.println("Calling");
            }
            if (x == 2) {
                System.out.println("sending Message");
            }
            if (x == 3) {
                System.out.println("browsing");
            }
            if (x == 4) {
                System.out.println("shareing");
            }
        }


    }
}