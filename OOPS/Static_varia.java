import java.util.Scanner;

public class Static_varia 
{
   static float r;
   static float p;
   static float t;
   public Static_varia()
   {
      r=0;
      p=0;
      t=0;
   }
   public Static_varia(float r,float p ,float t)
   {
      this.r=r;
      this.p=p;
      this.t=t;
   }
   void simple_interest()
   {
      System.out.println((this.p*this.r*this.t)/100);
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter values");
      float r = sc.nextFloat();
      float t = sc.nextFloat();
      float p = sc.nextFloat();
      Static_varia obj = new Static_varia(r, p, t);
      obj.simple_interest();
      Static_varia obj2 = new Static_varia(r, p, t);
      obj2.simple_interest();
      sc.close();
   } 
}
