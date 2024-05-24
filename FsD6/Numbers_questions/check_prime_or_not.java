package Numbers_questions;

import java.util.Scanner;

public class check_prime_or_not 
{
    void display(int n)
    {
        int i;
        for(i=2;i<=n;i++)
        {
            if(n % i == 0)
            break;
        }
        if(i==n)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       check_prime_or_not obj = new check_prime_or_not();
       obj.display(n);
       sc.close();
    }
}
