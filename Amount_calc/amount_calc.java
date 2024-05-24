package Amount_calc;
import java.util.Scanner;

public class amount_calc 
{
  public static void main(String[] args) 
  {
    double p,r,n,q,amount;
    int i;
    for(i=1;i<=10;i++)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter p, r, n and q respectivly");
        p=sc.nextFloat();
        r=sc.nextFloat();
        n=sc.nextFloat();
        q=sc.nextFloat();
        sc.close();
        amount= p*(Math.pow((1+r)/q, n*q));
        System.out.println("Amount is : "+amount);
    }
  }
}
