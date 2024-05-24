package POLYMORPHISM;
 interface Mouse
 {
    void lBtwDown(int x,int y);
    void rBtwDown(int x,int y);
 }
class Vinayak implements Mouse
{
    @Override public void lBtwDown(int x,int y)
    {
        System.out.println("Left Button: "+x+" "+y);
    }
    @Override public void rBtwDown(int x,int y)
    {
        System.out.println("Right Butoon: "+x+" "+y);
    }
}
public class Interface 
{
  public static void main(String[] args) 
  {
    Vinayak obj = new Vinayak();
    obj.lBtwDown(10, 20);
    obj.rBtwDown(30, 40);
  }  
}
