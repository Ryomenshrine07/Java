package Addition;

import java.util.Scanner;

class DivideTwoInteger
{
    static int divide(long dividend, long divisor)
    {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        int quotient = 0;
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);
        while (absoluteDividend >= absoluteDivisor)
        {
            int shift = 0;
            while (absoluteDividend >= (absoluteDivisor << shift))
            {
                shift++;
            }
            quotient += (1 << (shift - 1));
            absoluteDividend -= absoluteDivisor << (shift - 1);
        }
        return sign == -1 ? -quotient : quotient;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend :");
        long dividend = sc.nextInt();
        System.out.println("Enter Divisor :");
        long divisor = sc.nextInt();
        int ans = divide(dividend,divisor);
        System.out.println("Answer is :"+ans);
    }
}