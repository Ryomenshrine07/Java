package Recursion;

import java.util.Scanner;

public class Example1
{
    static int recursionFunc(int n)
    {
        if(n > 0)
        {
            System.out.print(n+" ");
            recursionFunc(n-1);
            recursionFunc(n-2);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Value :");
        int n = sc.nextInt();
        recursionFunc(n);
    }
}
