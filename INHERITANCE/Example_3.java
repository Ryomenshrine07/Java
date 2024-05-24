package INHERITANCE;
class Vinayak1
{
    public Vinayak1()
    {
        System.out.println("In Vinayak's Ctor");
    }
    public Vinayak1(int x)
    {
        System.out.println("In Vinayak's Para Ctor");
    }
}
 class Priyanka1 extends Vinayak1
{
    public Priyanka1()
    {
        System.out.println("In Priyanka's Ctor");
    }
    public Priyanka1(int x)
    {
        super(x);
        System.out.println("In Prinyaka's para Ctor");
    }
}

public class Example_3 
{
  public static void main(String[] args) 
  {
    Priyanka1 obj;
    obj = new Priyanka1();
    Priyanka1 obj2 = new Priyanka1(5);
  }  
}
