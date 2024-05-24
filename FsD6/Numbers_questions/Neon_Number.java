//A neon number is a number where the sum of digits of square of the number is equal to the number. The task is to check and print neon numbers in a range.
//        Input : 9
//                Output : Neon Number
//                Explanation: square is 9*9 = 81 and
//                sum of the digits of the square is 9.

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Neon_Number
{
    static void display(int n)
    {
        int sqrt = n * n,sum = 0;
        while(sqrt!=0)
        {
            int d = sqrt % 10;
            sum = sum + d;
            sqrt = sqrt / 10;
        }
        if(sum == n)
            System.out.println(n+" is a Neon Number");
        else
            System.out.println(n+" is not a Neon Number");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        display(n);
    }
}
