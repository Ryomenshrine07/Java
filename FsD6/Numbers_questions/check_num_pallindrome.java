package Numbers_questions;

import java.util.Scanner;

public class check_num_pallindrome 
{
   void display(int n)
    {
        int rev = 0,d,c=n;
        while(n!=0)
        {
            d = n % 10;
            rev = rev * 10 + d;
            n=n/10;
        }
        if(rev==c)
        System.out.println(rev+" is a Pallindrome number");
        else
        System.out.println(rev+" is not Pallindrome number");

    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       check_num_pallindrome obj = new check_num_pallindrome();
       obj.display(n);
       sc.close();
    } 
}
