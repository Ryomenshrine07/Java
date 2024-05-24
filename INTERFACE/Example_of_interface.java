package INTERFACE;

interface Example1
{
    final static float PI = 3.14f;
   public abstract void disp();
   default void normal()
   {
       System.out.println("Hello");
   }
}
interface Example2 extends Example1
{
    final static float PI = 24.77f;
    public abstract void show();
}

public class Example_of_interface implements Example2
{
    public static void main(String[] args)
    {
        Example_of_interface obj = new Example_of_interface();
        obj.disp();
        obj.show();

//        System.out.println(Example1.PI);

//        System.out.println(Example2.PI);
//        obj.normal();
//        Example1.PI = 12.3f; final variable cannot be assigned
    }

    @Override
    public void disp()
    {
        System.out.println("PI OF EXAMPLE 1 is :"+Example1.PI);
    }

    @Override
    public void show()
    {
        System.out.println("PI OF EXAMPLE 1 is :"+Example2.PI);
    }
}
