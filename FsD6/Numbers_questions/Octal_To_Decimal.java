package FsD6.Numbers_questions;

import java.util.Scanner;

public class Octal_To_Decimal 
{
   void display(int n)
    {
        int d,i=0,c=n;
        double sum = 0;
        while(n!=0)
        {
            d = n % 10; 
            sum = sum + Math.pow(8, i) * d;
            i++;
            n = n / 10;
        }
        System.out.println("Decimal Equivalent Of "+c+" Is : "+(int)sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Octal_To_Decimal obj = new Octal_To_Decimal();
       obj.display(n);
       sc.close();
    } 
}
