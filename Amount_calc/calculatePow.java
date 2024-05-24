package Amount_calc;

import java.util.Scanner;

public class calculatePow
{
    static double calculatePower(double x, long n)
    {
        if (n == 0)
        {
            return 1.0;
        }
        System.out.println("Calling Function");
        double value = calculatePower(x, n/2);
        System.out.println("AfterCall value : "+value);
        if (n % 2 == 0)
        {
            System.out.println("in Even");
            return value * value;
        }
        else
        {
            System.out.println("In Odd");
            return (value * value) * x;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        double x = sc.nextDouble();
        System.out.println("Enter Power :");
        int n = sc.nextInt();
        if(n < 0)
        {
            System.out.println(1.0/ calculatePower(x,n));
        }
        else
        {
            System.out.println(calculatePower(x,n));
        }
    }
}
