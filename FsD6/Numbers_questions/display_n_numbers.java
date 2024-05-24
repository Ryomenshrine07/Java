package Numbers_questions;
import java.util.Scanner;
public class display_n_numbers
{
    void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       display_n_numbers obj = new display_n_numbers();
       obj.display(n);
       sc.close();
    }
}