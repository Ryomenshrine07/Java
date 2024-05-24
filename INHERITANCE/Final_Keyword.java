package INHERITANCE;
/*final*/ class Vinayak
{
    final public void fun()
    {
        System.out.println("In Vinayak's Fun");
    }
}
class Priyanka //extends Vinayak
{
    public void fun()
    {
        System.out.println("In Priyanka's Fun");
    }
} 

public class Final_Keyword 
{
  public static void main(String[] args) 
  {
    Priyanka1 obj = new Priyanka1();
  }   
}
