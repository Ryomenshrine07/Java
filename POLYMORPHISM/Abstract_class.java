package POLYMORPHISM;
abstract class vehicle
{
    abstract void speed(int x);
    abstract void maintanence(String s);
    abstract void value(String p);
}

class TwoWheeler extends vehicle
{
    void speed(int x)
    {
        System.out.println("TwoWheeler Speed is :"+x+" Km/hr");
    }
    void maintanence(String s)
    {
        System.out.println("TwoWheeler MAintanence :"+s);
    }
    void value(String p)
    {
        System.out.println("TwoWheeler Value is :"+p+" /-");
    }
}

class FourWheeler extends vehicle
{
    void speed(int x)
    {
        System.out.println("TwoWheeler Speed is :"+x+" Km/hr");
    }
    void maintanence(String s)
    {
        System.out.println("TwoWheeler MAintanence :"+s);
    }
    void value(String p)
    {
        System.out.println("TwoWheeler Value is :"+p+" /-");
    }
}

class Airborn extends vehicle
{
    void speed(int x)
    {
        System.out.println("Airborn Speed is :"+x+" Km/hr");
    }
    void maintanence(String s)
    {
        System.out.println("Airborn MAintanence :"+s);
    }
    void value(String p)
    {
        System.out.println("Airborn Value is :"+p+" /-");
    }
}

public class Abstract_class 
{
  public static void main(String[] args)
  {
    vehicle maruti,bajaj,indian;
    maruti = new FourWheeler();
    bajaj = new TwoWheeler();
    indian = new Airborn();

    maruti.speed(100);
    maruti.maintanence("Great");
    maruti.value("80,000");

    bajaj.speed(250);
    bajaj.maintanence("Good");
    bajaj.value("1,20,000");

    indian.speed(1000);
    indian.maintanence("Excellent");
    indian.value("20,00,00,000");
  }  
}
