package Strings;

import java.util.Scanner;

public class ReverseBits
{
    static String convertToBinary(int n)
    {
        int d,c=n,count=0,zeros=0;
        int rev = 0;
        while(n!=0)
        {
            d = n % 2;
            if(d==1)
            {
                count++;
            }
            if(d == 0 && count == 0)
            {
                zeros++;
            }
            rev = rev * 10 + d;
            n = n / 2;
        }
        if(zeros>0)
        {
            rev = (int)(rev * Math.pow(10, zeros));
        }
        return Integer.toString(rev);
    }
    static int calculateReverseBits(int n)
    {
        System.out.println(convertToBinary(n));
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int reversedBits = calculateReverseBits(n);
        System.out.println("Output is :"+reversedBits);
    }
}
