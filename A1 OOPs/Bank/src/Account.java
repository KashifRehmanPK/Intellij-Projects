
public class Account {

    private String name;
    private int contactnumber;
    private int age;
    private int random;
    private long CNIC;
    private static double zakatRate = 2.5;
    private int balance;
    private int customerid;

    public void setName(String name) {
        this.name = name;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    public void setCNIC(long CNIC) {
        this.CNIC = CNIC;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setZakatRate(double zRate) {
        zakatRate = zRate;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }


    public void setbalance(int balance) {
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public int getAge() {
        return age;
    }

    public long getCNIC() {
        return CNIC;
    }

    public static double getZakatRate() {
        return zakatRate;
    }

    public int getRandom() {
        return random;
    }

    public int getbalance() {
        return balance;
    }

    public int getCustomerid() {
        return customerid;
    }

    public double zakatammount() {
        return (balance * (zakatRate / 100));

    }

    public int addbalance(int x) {
        this.balance = (balance + x);
        return balance;
    }

    public int deductbalance(int y) {
        this.balance = (balance - y);
        return balance;
    }

}
