//package Numbers_questions;
import java.util.Scanner;

public class GCD_between_two_recur 
{
   void display(int a,int b,int i,int l,int small)
    {
        if(i<=small)
        {
            if(a % i == 0 && b % i == 0)
            {
                if(i>l)
                {
                    l=i;
                }
            }
            i++;
            display(a, b, i, l, small);
        }
        else
        {
        System.out.println("GCD of "+a+" and "+b+" is :"+l);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       GCD_between_two_recur obj = new GCD_between_two_recur();
       int l = 0,i = 1;
       int small = n<n1?n:n1;
       obj.display(n,n1,i,l,small);
       sc.close();
    } 
}
