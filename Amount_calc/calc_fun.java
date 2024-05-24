package Amount_calc;
import java.util.*;
public class calc_fun 
{
    static float calc(int a, float b)
    {
        float s;
        s=a*b;
        return s;
    }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a integer and a float number");
    int a;float b,r=0;
    a=sc.nextInt();
    b=sc.nextFloat();
    r=calc(a,b);
    System.out.println("product is : "+r);
    sc.close();
  }  
}
