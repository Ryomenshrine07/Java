//An evil number is a non-negative number that has an even number of 1s in its binary expansion.
//        (Binary Expansion – is representation of a number in the binary numeral system or
//        base-2 numeral system which represents numeric values
//        using two different symbols: typically 0 (zero) and 1 (one)).


package FsD6.Numbers_questions;

import java.util.Scanner;

public class Evil_number
{
    static int ConvertToBinary(int n)
    {
        int c = n, rev = 0, count = 0 , count1 = 0;
        while(c!=0)
        {
            int d = c % 2;
            if(d == 0 && count1 ==0)
            {
                count++;
            }
            else
            {
                count1++;
            }
            rev = rev * 10 + d;
            c = c / 2;
        }
        while(count!=0)
        {
            rev = rev*10;
            count--;
        }
        return rev;
    }
    static boolean EvilOrNot(int n)
    {
        boolean flag = false;
        int count = 0;
        while(n!=0)
        {
            count++;
            n = n / 10;
        }
        return count % 2 == 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int binary_num = ConvertToBinary(n);
        boolean even_ones = EvilOrNot(binary_num);
        if(even_ones)
            System.out.println(n+" is a Evil number");
        else
            System.out.println(n+" is not a Evil number");
    }
}
