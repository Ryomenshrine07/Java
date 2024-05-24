//package POLYMORPHISM;

abstract class Printer
{
    protected String name;
    public Printer(String s)
    {
        name = s;
    }
    abstract void print(String docname);
}

class LaserPrinter extends Printer
{
    public LaserPrinter(String s)
    {
        super(s);
    }
    void print(String docname)
    {
        System.out.println("Name of the printer is :"+name);
        System.out.println("LaserPrinter.print-> "+docname);
    }
} 

class InkjetPrinter extends Printer
{
    public InkjetPrinter(String s)
    {
        super(s);
    }
    void print(String docname)
    {
        System.out.println("Name of the printer is :"+name);
        System.out.println("InkjetPrinter.print-> "+docname);
    }
}

public class Printer_class 
{
  public static void main(String[] args) 
  {
    Printer p1,p2;
    p1 = new LaserPrinter("Laser Printer");
    p2 = new InkjetPrinter("Ink jet Printer");
    p1.print("Vinayak assign.pdf");
    p2.print("Priyanka assign.pdf");
  }  
}
