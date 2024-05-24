package INHERITANCE;

class B
{
    protected int a = 6;
    /*private*/ void b1()
    {
        System.out.println("In Function b1");
    }
    /*private*/ void b2()
    {
        System.out.println("In function b2");
    }
    void call_private()
    {
        System.out.println("Calling private b2 now ");
        b2();
    }
}
class D extends B
{
    void d1()
    {
        System.out.println("In function d1");
    }
    void d2()
    {
        System.out.println("In function d2");
    }
}

public class diff_classes 
{
    public static void main(String[] args) 
    {
        D obj;
        obj = new D();
        obj.b1();
        obj.b2();
        obj.a = 10;
    }
}
