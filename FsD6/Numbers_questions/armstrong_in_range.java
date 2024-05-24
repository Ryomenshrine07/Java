package FsD6.Numbers_questions;

import java.util.Scanner;

public class armstrong_in_range 
{
   void display(int a, int b)
   {
       int d;
       for (int i = a; i <= b; i++)
       {
           int n = i;
           int sum = 0;
           while (n != 0)
           {
               d = n % 10;
               sum = sum + d * d * d;
               n = n / 10;
           }
           if (sum == i && i != 1)
           {
               System.out.print(i+" ");
           }
       }
   }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Start number and End number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       armstrong_in_range obj = new armstrong_in_range();
       obj.display(n,n1);
       sc.close();
    } 
}
