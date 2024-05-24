//package INHERITANCE.Has_A_relation;
class Proffessor
{
    String name;
    Proffessor(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println("Proffessor name is "+this.name);
    }

}

class Department
{
    String name;
    Proffessor[] proffessor;
    Department(String name,Proffessor[] proffessor)
    {
        this.proffessor = proffessor;
        this.name = name;
    }
    void display()
    {
        for(Proffessor p : proffessor)
        System.out.println(p.name+" are of "+name+" Department");
    }
}


public class Aggregation 
{
    public static void main(String[] args) 
    {
        Proffessor p1 = new Proffessor("Vinayak upadhyay");
        Proffessor p2 = new Proffessor("Manjiri Upadhyay");
        Proffessor p3 = new Proffessor("Virat Sharma");
    
        Department d = new Department("CSBS", new Proffessor[] {p1,p2,p3});
        d.display(); 
    }
}
