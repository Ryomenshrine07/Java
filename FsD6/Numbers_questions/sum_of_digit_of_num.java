package Numbers_questions;

import java.util.Scanner;

public class sum_of_digit_of_num 
{
   void display(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum = sum + n%10;
            n=n/10;
        }
        System.out.println("Sum of digits is :"+sum);

    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       sum_of_digit_of_num obj = new sum_of_digit_of_num();
       obj.display(n);
       sc.close();
    } 
}
