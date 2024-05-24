//An Emirp Number (prime spelled backwards) is a prime number that results in
//a different prime when its decimal digits are reversed. This definition excludes the related palindromic primes.

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Emirp_Number
{
    static boolean check_prime(int n)
    {
        int i;
        boolean flag;
        for(i=2;i<=n;i++)
        {
            if(n % i == 0)
                break;
        }
        flag = i == n;
        return flag;
    }
    static int reverse_number(int n)
    {
        int d , rev = 0;
        while(n!=0)
        {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag = check_prime(n);
        if (flag)
        {
            int rev = reverse_number(n);
            boolean flag2 = check_prime(rev);
            if(flag2)
                System.out.println(n+" is a Emirp Number");
            else
                System.out.println(n+" is not a Emirp Number");
        }
        else
            System.out.println(n+" is not a Emirp Number");
    }
}
