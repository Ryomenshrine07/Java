package Numbers_questions;
import java.util.Scanner;
public class Sum_of_nat_recur 
{
   void display(int n,int i,int sum)
    {
        if(i<=n)
        {
            sum = sum + i;
            i++;
            display(n, i, sum);
        }
        else
        {
            System.out.println(sum);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Sum_of_nat_recur obj = new Sum_of_nat_recur();
       int i=1,sum=0;
       obj.display(n,i,sum);
       sc.close();
    } 
}
