package INHERITANCE;
import java.util.Scanner;

class Vinayak3
{
    protected String s;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String");
        s = sc.nextLine();
        sc.close();
    }
    void display()
    {
        System.out.println("String is :"+s);
    }
}
class Priyanka3 extends Vinayak3
{
    void UpperCase()
    {
        s = s.toUpperCase();
    }
    void LowerCase()
    {
        s = s.toLowerCase();
    }
}

public class My_String 
{
  public static void main(String[] args) 
  {
    Priyanka3 obj;
    obj = new Priyanka3();
    obj.get();
    obj.UpperCase();
    obj.display();
    obj.LowerCase();
    obj.display();
  }  
}
