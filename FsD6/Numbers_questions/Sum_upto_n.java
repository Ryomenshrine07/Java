package Numbers_questions;

import java.util.Scanner;

public class Sum_upto_n 
{
    void display(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Sum_upto_n obj = new Sum_upto_n();
       obj.display(n);
       sc.close();
    }
}
