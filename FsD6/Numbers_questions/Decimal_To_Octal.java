package Numbers_questions;

import java.util.Scanner;

public class Decimal_To_Octal 
{
   void display(int n)
    {
        int d,c=n;
        int rev = 0;
        while(n!=0)
        {
            d = n % 8;
            rev = rev * 10 + d;
            n = n / 8;
        }
        int oct = 0;
        while(rev!=0)
        {
            d = rev % 10;
            oct = oct * 10 + d;
            rev = rev / 10;
        }
        System.out.println("Octal Equivalent Of "+c+" Is : "+(int)oct);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Decimal_To_Octal obj = new Decimal_To_Octal();
       obj.display(n);
       sc.close();
    } 
}
