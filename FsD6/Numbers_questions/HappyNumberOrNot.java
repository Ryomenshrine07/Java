package FsD6.Numbers_questions;

import java.util.Scanner;

public class HappyNumberOrNot
{
    static boolean checkHappyOrNot(int n,int sum)
    {
        if(n==1)
        {
            return true;
        }
        if (n == 4)
        {
            return false;
        }
        while(n!=1) 
        {
            int c = n;
            while (c != 0)
            {
                int d = c % 10;
                sum = sum + d * d;
                c = c / 10;
            }
            n = sum;
        }
        return checkHappyOrNot(sum,0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        int sum = 0;
        boolean flag = checkHappyOrNot(n,sum);
        if(flag)
        {
            System.out.println("It is Happy Number");
        }
        else
        {
            System.out.println("Not a Happy Number");
        }
    }
}
