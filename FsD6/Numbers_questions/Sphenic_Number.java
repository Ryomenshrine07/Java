//A Sphenic Number is a positive integer n which is product of exactly three distinct primes.
//        The first few sphenic numbers are 30, 42, 66, 70, 78, 102, 105, 110, 114, …
//Sphenic number has exactly 8 divisors
package FsD6.Numbers_questions;

import java.util.Scanner;

public class Sphenic_Number
{
    static boolean check_Sphenic_or_not(int n)
    {
        boolean flag = false;
        int pro = 1, count = 0;
        for(int i=1;i<=100;i++)
        {
            count = 0;
            for(int j=1;j<=i;j++)
            {
                if(i % j == 0 && count < 8)
                    count++;
            }
            if(count == 8)
            {
                System.out.print(i+" ");
            }
//            if(count != 8)
//            {
//                flag = false;
//                break;
//            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean sphenic = check_Sphenic_or_not(n);
    }
}
