package Methodoverloading;

public class overload_job 
{
    static void vinayak()
    {
        String desig="Manager";
        String loc="Kolar road";
        String company="Google";
        String add="jhansi";
        System.out.println(desig);
        System.out.println(loc);
        System.out.println(company);
        System.out.println(add);
    }
    static void vinayak(String desig,String loc,String company,String add)
    {
        System.out.println(desig);
        System.out.println(loc);
        System.out.println(company);
        System.out.println(company);
    }
    public static void main(String[] args) 
    {
        vinayak();
        vinayak("manager", "cp", "google", "jhansi");
    }
}
