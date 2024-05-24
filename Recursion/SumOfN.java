package Recursion;

import java.util.Scanner;

public class SumOfN
{
    static int getsum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n+getsum(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = getsum(n);
        System.out.println("Sum is : "+sum);

    }
}
