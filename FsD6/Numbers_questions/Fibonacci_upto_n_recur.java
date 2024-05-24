package Numbers_questions;

import java.util.Scanner;

public class Fibonacci_upto_n_recur 
{
    void display(int a,int b,int c,int i,int n)
    {
        if(i<=n-2)
        {
            if(i==1)
            {
                System.out.print(a+" "+b+" ");
            }
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
            display(a, b, c, i, n);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Fibonacci_upto_n_recur obj = new Fibonacci_upto_n_recur();
       int a = 0, b = 1, c = 0, i = 1;
       obj.display(a,b,c,i,n);
       sc.close();
    }
}
