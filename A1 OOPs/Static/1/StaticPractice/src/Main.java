public class Main {
    public static void main(String[] args) {

        Emp emp1 = new Emp();

        emp1.setName("Kashif");


        Emp emp2 = new Emp();
        emp2.setName("Jahangir");

        emp1.PrintUserDetail();
        emp2.PrintUserDetail();
        //System.out.println("Employee Name: "+ emp1.Name +" OrgName: "+ emp1.GetOrgName());
        //System.out.println("Employee Name: "+ emp2.Name +" OrgName: "+ emp2.GetOrgName());


        //System.out.println(Emp.GetOrgName());
        Emp.SetOrgName("asdf");
        //System.out.println(Emp.GetOrgName());

        emp1.PrintUserDetail();
        emp2.PrintUserDetail();

    }
}