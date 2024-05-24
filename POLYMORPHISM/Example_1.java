package POLYMORPHISM;

class One
{
    void display()
  {
    System.out.println("in Class One");
  }
}
class OnenOne extends One
{
    void display()
    {
        System.out.println("In class OnenOne");
    }
}
class TwonTwo extends One
{
    void display()
    {
        System.out.println("In class Twontwo");
    }
}
public class Example_1 
{
  public static void main(String[] args) 
  {
    One ptr;
    OnenOne obj = new OnenOne();
    TwonTwo obj2 = new TwonTwo();
    ptr = obj;
    ptr.display();
    ptr = obj2;
    ptr.display();    
  }  
}
