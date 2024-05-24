package INHERITANCE;
class parent
{
    String surname = "Upadhyay";
    int property = 10000;
    void display()
    {
        System.out.println("in parent");
    } 
}

class child extends parent
{
    int child_property = 20000;
   void display()
   {
    super.display();
    // System.out.println("child's Surname is :"+c.surname);
    System.out.println("child's Propert is :"+property);
   } 
}

public class coaching_1 
{
  public static void main(String[] args) 
  {
    parent p = new parent();                                                                
    System.out.println("parent property "+p.property);
    child c = new child();
    p = new child();
    p.display();
  }

}
