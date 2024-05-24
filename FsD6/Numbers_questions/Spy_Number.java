//A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
//        Examples :
//
//        Input : 1412
//        Output : Spy Number
//        Explanation :
//        sum = (1 + 4 + 1 + 2) = 8
//        product = (1 * 4 * 1 * 2) = 8
//        since, sum == product == 8

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Spy_Number
{
    static int sum_Of_Digits(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        return sum;
    }
   static int product_Of_Digits(int n)
    {
        int pro = 1;
        while(n!=0)
        {
            int d = n % 10;
            pro = pro * d;
            n = n / 10;
        }
        return pro;
    }
    static boolean compare(int sum,int product)
    {
        return sum==product;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = sum_Of_Digits(n);
        int product = product_Of_Digits(n);
        boolean flag = compare(sum,product);
        if(flag)
            System.out.println(n+" is a Spy Number");
        else
            System.out.println(n+" is not a Spy Number");
    }
}
