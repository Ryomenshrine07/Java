package Numbers_questions;

import java.util.Scanner;

public class reverse_a_num 
{
   void display(int n)
    {
        int rev = 0,d;
        while(n!=0)
        {
            d = n % 10;
            rev = rev * 10 + d;
            n=n/10;
        }
        System.out.println("Reverse of number is :"+rev);

    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       reverse_a_num obj = new reverse_a_num();
       obj.display(n);
       sc.close();
    } 
}
