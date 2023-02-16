import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {
        int d = 0, o, id = 0, f = 0;
        String z;
        long g;
        System.out.println("Welcome to HBL-Bank");
        Scanner input = new Scanner(System.in);
        Account obj1 = new Account();
        ArrayList<Account> usersList = new ArrayList<Account>();

        while (true) {

            System.out.println("Press 1 To Add Account");
            System.out.println("Press 2 To Add Balance");
            System.out.println("Press 3 To Deduct Balance");
            System.out.println("Press 4 To Show Balance");
            System.out.println("Press 5 set Zakat Rate");
            System.out.println("Press 6 Show Current Zakat Rate");
            System.out.println("Press 7 To Show Zakat Amount");
            System.out.println("Press 8 to show your age");
            System.out.println("press 9 to Show customer detail");
            System.out.println("Press 10 to show uour CNIC");
            System.out.println("press 11 to Show Your Customer ID");
            System.out.println("Press 12 Exit");

            int x = input.nextInt();

            if (x == 1) {
                Account obj2 = new Account();

                Random rand = new Random();
                id = rand.nextInt(999, 9999);
                obj2.setCustomerid(id);
                //System.out.println("System generted id is: " + id);
                System.out.println("Enter Your Name");
                z = input.next();
                obj2.setName(z);
                System.out.println("Enter Your Contact Number");
                int l = input.nextInt();
                System.out.println("Enter Your Age");
                int i = input.nextInt();
                obj2.setAge(i);
                System.out.println("Enter Your CNIC");
                g = input.nextLong();
                obj2.setCNIC(g);
                System.out.println("Add Your Balance");
                d = input.nextInt();
                obj2.setbalance(d);

                System.out.println("Success! Your Account Have Been Added");

                System.out.println("---------------------------------------------------------------");
                System.out.println("\n" + "Your customer ID is " + id + "\n");
                System.out.println("---------------------------------------------------------------");

                usersList.add((obj2));
            }
            else if (x == 2) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("To Add Balance");
                        int balance = input.nextInt();
                        System.out.println(obj.addbalance(balance));
                        System.out.println("Success!");
                    }
                }
            }
            else if (x == 3) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("To Deduct Balance");
                        int j = input.nextInt();
                        System.out.println(obj.deductbalance(j));
                        System.out.println("Success");
                    }
                }
            }
            else if (x == 4) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();
                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("Show Balance");
                        int s1 = obj.getbalance();
                        System.out.println(s1);
                    }
                }
            }
            else if (x == 7) {
                {
                    System.out.println("Enter your CustmerID ID");
                    int custID = input.nextInt();

                    for (int s = 0; s < usersList.size(); s++) {
                        Account obj = usersList.get(s);
                        if (custID == obj.getCustomerid()) {
                            System.out.println("Show Zakat Amount");
                            double s2 = obj.zakatammount();
                            System.out.println(s2);
                        }
                    }
                }
            }
            else if (x == 6) {

                System.out.println("Show Current Zakat Rate");

                System.out.println(Account.getZakatRate());
            }

            else if (x == 5) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("Set Zakat Rate");
                        double c = input.nextDouble();
                        Account.setZakatRate(c);
                    }
                }
            }
            else if (x == 8) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("show your age");
                        System.out.println(obj.getAge());
                    }
                }
            }
            else if (x == 9) {
                System.out.println("Showing Customer Detail");
                System.out.println("Enter Your customer ID");
                int a = input.nextInt();


                for (int r = 0; r < usersList.size(); r++) {
                    Account obj = usersList.get(r);
                    if (obj.getCustomerid() == a) {
                        System.out.println("Your name is " + obj.getName());
                        System.out.println("Your age is " + obj.getAge());
                        System.out.println("Your account balance is " + obj.getbalance());
                        System.out.println("Your contact number is " + obj.getContactnumber());
                        System.out.println("Your CNIC is " + obj.getCNIC());

                    } else {
                        System.out.println("There is no such ID avalible in our database");
                        // break;
                    }
                }
            }
            else if (x == 10) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("show your CNIC");
                        System.out.println(obj.getCNIC());
                    }
                }
            }
            else if (x == 11) {
                System.out.println("Enter your CustmerID ID");
                int custID = input.nextInt();

                for (int s = 0; s < usersList.size(); s++) {
                    Account obj = usersList.get(s);
                    if (custID == obj.getCustomerid()) {
                        System.out.println("show your Customer ID");
                        System.out.println(obj.getCustomerid());
                    }
                }
            }
            else if (x == 12) {
                break;
            }
        }
    }
}
