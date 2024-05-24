package Recursion;

import java.util.Scanner;

public class FibonacciSeries
{
    static void getFibboSeries(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        n--;
        a = b;
        b = c;
        getFibboSeries(a,b,n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Size of Series :");
        int n = sc.nextInt();
        System.out.println("Series :");
        System.out.print(a+" "+b+" ");
        getFibboSeries(a,b,n-2);

    }
}
