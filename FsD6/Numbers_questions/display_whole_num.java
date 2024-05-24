package Numbers_questions;
import java.util.Scanner;

public class display_whole_num 
{
   void display(int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       display_whole_num obj = new display_whole_num();
       obj.display(n);
       sc.close();
    } 
}
