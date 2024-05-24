//package Numbers_questions;

import java.util.Scanner;

public class factorail_of_num_recur 
{
   void display(int n,int i,int f)
    {
        if(i<=n)
        {
            f = f * i;
            i++;
            display(n, i, f); 
        }
        else
        System.out.println("Factorial of "+n+" is :"+f);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       factorail_of_num_recur obj = new factorail_of_num_recur();
       int i=1,f=1;
       obj.display(n,i,f);
       sc.close();
    } 
}
