package FsD6.Revision;

//class Practice
//{
//    B obj;
//    Practice(B obj)
//    {
//        System.out.println("In Practice Constructor");
//        this.obj = obj;
//        obj.display();
//    }
//}
//class B
//{
//    int x = 5;
//    B()
//    {
//        System.out.println("In B's Constructor");
//        Practice obj = new Practice(this);
//    }
//    void display()
//    {
//        System.out.println("Value of X is :"+x);
//    }
//}

//class Practice
//{
//    void display()
//    {
//        this.show();
//        System.out.println("In display Method of Practice");
//    }
//    void show()
//    {
//        System.out.println("In show Method of Practice");
//    }
//}

//class Practice
//{
//    int a,b;
//    Practice(int a,int b)
//    {
//        this.a = a;
//        this.b = b;
//    }
//    void display(Practice obj)
//    {
//        System.out.println("Value of a :"+obj.a);
//        System.out.println("Value of b :"+obj.b);
//    }
//    void get()
//    {
//        display(this);
//    }
//}

//class Practice
//{
//    int a,b;
//    Practice(int a,int b)
//    {
//        this.a = a;
//        this.b = b;
//    }
//    void display()
//    {
//        System.out.println("Value of a is :"+a);
//        System.out.println("Value of b is :"+b);
//    }
//    Practice get()
//    {
//        return this;
//    }
//}


class Practice
{
    int a,b;
    double c,d;
    Practice()
    {
        this(10,20);
    }
    Practice(int a, int b)
    {
        this(10.4,78.3);
        this.a = a;
        this.b = b;
    }
    Practice(double c, double d)
    {
        this.c = c;
        this.d = d;
    }
    void display()
    {
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
        System.out.println("Value of c is :"+c);
        System.out.println("Value of d is :"+d);
    }
    Practice get()
    {
        return this;
    }
}


public class ThisKeyWord
{
    public static void main(String[] args)
    {
        Practice obj1 = new Practice();
        Practice obj2 = new Practice();
        obj1.get().display();
        System.out.println();
        obj2.get().display();
    }

}
