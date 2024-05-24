package Numbers_questions;

import java.util.Scanner;

public class Decimal_to_Binary 
{
   void display(int n)
    {
        int d,c=n,count=0,zeros=0;
        int rev = 0;
        while(n!=0)
        {
            d = n % 2;
            if(d==1)
            {
                count++;
            }
            if(d == 0 && count == 0)
            {
                zeros++;
            }
            rev = rev * 10 + d;
            n = n / 2;
        }
        if(zeros>0)
        {
            rev = (int)(rev * Math.pow(10, zeros));
        }
        System.out.println("Binary Equivalent Of "+c+" Is : "+rev);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Decimal_to_Binary obj = new Decimal_to_Binary();
       obj.display(n);
       sc.close();
    } 
}
