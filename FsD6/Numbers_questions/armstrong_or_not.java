package FsD6.Numbers_questions;

import java.util.Scanner;

public class armstrong_or_not 
{
    void display(int n)
    {
        int c = n,d,sum = 0;
        while(n!=0)
        {
            d = n % 10;
            sum = sum + d * d * d;
            n = n / 10;
        }
        if(sum == c) {
            System.out.println("It is a Armstrong number");
        }
        else {
            System.out.println("It is not A Armstrong number");
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       armstrong_or_not obj = new armstrong_or_not();
       obj.display(n);
       sc.close();
    }
}
