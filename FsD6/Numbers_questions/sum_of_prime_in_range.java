package Numbers_questions;
import java.util.Scanner;

public class sum_of_prime_in_range 
{
   void display(int start,int end)
    {
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            int j;
            for(j=2;j<=i;j++)
            {
                if(i % j == 0)
                break;
            }
            if(j == i || i == 1)
            sum = sum + i;
        }
        System.out.println("Sum of Prime numbers in this range is :"+sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Start and End number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       sum_of_prime_in_range obj = new sum_of_prime_in_range();
       obj.display(n,n1);
       sc.close();
    } 
}
