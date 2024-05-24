package Numbers_questions;

import java.util.Scanner;

public class display_odd_natural 
{
    void display(int n)
    {
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       display_odd_natural obj = new display_odd_natural();
       obj.display(n);
       sc.close();
    }
}
