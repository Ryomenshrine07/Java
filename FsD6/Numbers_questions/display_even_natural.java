package Numbers_questions;
import java.util.Scanner;
public class display_even_natural
{
    void display(int n)
    {
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       display_even_natural obj = new display_even_natural();
       obj.display(n);
       sc.close();
    }
}