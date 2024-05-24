package Recursion;

import java.util.Scanner;

public class FactoresOfNumber
{
    static void getFactors(int n,int i)
    {
        if(i > n)
        {
            return;
        }
        if(n % i == 0)
        {
            System.out.print(i+" ");
        }
        i++;
        getFactors(n,i);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int i = 1;
        getFactors(n,i);
    }
}
