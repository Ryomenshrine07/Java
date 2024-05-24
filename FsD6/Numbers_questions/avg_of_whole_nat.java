package Numbers_questions;

import java.util.Scanner;

public class avg_of_whole_nat 
{
  void display(int n)
    {
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
            sum = sum + i;
        }
        float avg = sum/n;
        System.out.println("Average is :"+avg);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       avg_of_whole_nat obj = new avg_of_whole_nat();
       obj.display(n);
       sc.close();
    }  
}
