package POLYMORPHISM;
abstract class Demo
{
    Demo()
    {
        System.out.println("Calling");
    }
    void display()
    {

    }
    abstract void run();
    abstract void disp();
    abstract void priyanka();
}

public class Demo_asbtract extends Demo
{
    public static void main(String[] args)
    {
        Demo_asbtract obj = new Demo_asbtract();
        obj.display();
        obj.run();
    }
    @Override
    void run()
    {
        System.out.println("Running");
    }

    @Override
    void disp()
    {

    }
    @Override
    void priyanka()
    {

    }
}
