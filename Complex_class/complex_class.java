package Complex_class;
import java.util.Scanner;
class complex
{
    private int img ,real;
    public void get_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real and imaginary number seperated by space");
        real=sc.nextInt();
        img=sc.nextInt();
        sc.close();
    }
    public complex()
    {
        real=0;
        img=0;
    }
    public complex(int a,int b)
    {
        real=a;
        img=b;
    }
    void addcomplex(complex t,complex p)
    {
        real=t.real+p.real;
        img=t.img+p.img;
    }
    void subcomplex(complex t,complex p)
    {
        real=t.real-p.real;
        img=t.img-p.img;
    }
    void mulcomplex(complex t,complex p)
    {
        real=t.real*p.real;
        img=t.img*p.img;
    }
    void divcomplex(complex t,complex p)
    {
        real = t.real/p.real;
        img = t.img/p.img;
    }
    
    void display()
    {
        if(img<0)
        {
            System.out.println(real+""+img+"i");    
        }
        else
        {
            System.out.println(real+"+"+img+"i");
        }
    }
    
}

public class complex_class 
{
  public static void main(String[] args) 
  {
    complex a= new complex();
    a.get_data();
    complex b= new complex();
    b.get_data();
    complex c= new complex();
    c.subcomplex(a, b);
    c.display();
  }   
}
