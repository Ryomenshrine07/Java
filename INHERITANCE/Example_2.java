package INHERITANCE;

class Vinayak2
{
    void fun()
    {
        System.out.println("In Vinayaks's Fun");
    }
    void save()
    {
        System.out.println("In Vinayaks's Save");
    }
    void run()
    {
        System.out.println("In Vinayak's Run");
    }
    void open()
    {
        System.out.println("In Vinayak's Open");
    }
}
class Priyanka2 extends Vinayak2
{
    void save()
    {
        System.out.println("In Priyanka's Save");
    }
    void run()
    {
        System.out.println("In Priyanka's Run");
    }
    void sukuna()
    {
        System.out.println("In Priyanka's Sukuna");
    }
    void open()
    {
        System.out.println("In Priyanka's Open");
        super.open();
    }
}

public class Example_2 
{
  public static void main(String[] args) 
  {
    Priyanka2 obj;
    obj = new Priyanka2();
    obj.fun();
    obj.save();
    obj.run();
    obj.sukuna();
    obj.open();
  }  
}
