public class Emp {

    private String Name;
    private static String OrgName = "abccompany";

    public void setName(String name) {
        Name = name;
    }

    public  String GetName(){
        return Name;
    }

    public void PrintUserDetail() {
        System.out.println("Name: "+ Name + " OrgName: "+ OrgName);
    }

    public static String GetOrgName(){
        return OrgName;
    }

    public static void SetOrgName(String orgName){
        OrgName = orgName;
    }

}
