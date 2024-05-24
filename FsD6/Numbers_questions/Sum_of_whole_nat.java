package Numbers_questions;

import java.util.Scanner;

public class Sum_of_whole_nat 
{
   void display(int n)
    {
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Sum_of_whole_nat obj = new Sum_of_whole_nat();
       obj.display(n);
       sc.close();
    }
}
