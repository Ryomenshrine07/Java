// A n digit number x is called Keith number if it appears in a special sequence (defined below) generated using its digits. The special sequence has first n terms as digits of x and other terms are recursively evaluated as sum of previous n terms.
// The task is to find if a given number is Keith Number or not.
//
// Input : x = 197
// Output : Yes
// 197 has 3 digits, so n = 3
// The number is Keith because it appears in the special
// sequence that has first three terms as 1, 9, 7 and
// remaining terms evaluated using sum of previous 3 terms.
// 1, 9, 7, 17, 33, 57, 107, 197, .....

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Keith_number 
{
    void display(int n, int i, int count, int sum, int copy, int a, int b, int c, int copy2)
    {
        if(copy!=0)
        {
            count++;
            copy = copy / 10;
            display(n, i, count, sum, copy, a, b, c, copy2);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Keith_number obj = new Keith_number();
       int i=1,count=0,sum=0,copy=n,a=0,b=0,c=0,copy2=n;
       obj.display(n,i,count,sum,copy,a,b,c,copy2);
       sc.close();
    }
}
