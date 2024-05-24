package Numbers_questions;
import java.util.Scanner;

public class count_fact_of_num 
{
    void display(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            sum = sum + i;
        }
        System.out.println("Sum of "+n+"'s factors is :"+sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       count_fact_of_num obj = new count_fact_of_num();
       obj.display(n);
       sc.close();
    }
}
