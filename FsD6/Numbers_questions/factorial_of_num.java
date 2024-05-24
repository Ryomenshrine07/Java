package Numbers_questions;

import java.util.Scanner;

public class factorial_of_num 
{
    void display(int n)
    {
        int f = 1;
        for(int i=1;i<=n;i++)
        {
            f = f * i;
        }
        System.out.println("Factorial of "+n+" is :"+f);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       factorial_of_num obj = new factorial_of_num();
       obj.display(n);
       sc.close();
    }
}
