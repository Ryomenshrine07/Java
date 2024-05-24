//A number is said to be Buzz Number if it ends with 7 OR is divisible by 7.
//        The task is to check whether the given number is buzz number or not.

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Buzz_Number
{
    int d;
    static boolean BuzzOrNot(int n)
    {
        if(n % 7 == 0)
        {
            return true;
        }
        else if(n % 10 == 7)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean check = BuzzOrNot(n);
        if(check)
            System.out.println(n+" is a Buzz number");
        else
            System.out.println(n+" is not a Buzz number");
    }
}
