package Numbers_questions;

import java.util.Scanner;

public class check_perfect_num 
{
   void display(int n)
    {
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(n % i == 0)
            sum = sum + i;
        }
        if(sum == n)
        System.out.println(sum+" is a Perfect number");
        else
        System.out.println(sum+" is not a Perfect number");
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       check_perfect_num obj = new check_perfect_num();
       obj.display(n);
       sc.close();
    } 
}