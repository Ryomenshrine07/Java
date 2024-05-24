package Numbers_questions;

import java.util.Scanner;

public class Fibonacci_upto_nth 
{
    void display(int n)
    {
        int a = 0, b = 1, c = 0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Fibonacci_upto_nth obj = new Fibonacci_upto_nth();
       obj.display(n);
       sc.close();
    }
}
