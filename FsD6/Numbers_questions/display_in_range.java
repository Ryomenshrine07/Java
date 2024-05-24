//package Numbers_questions;

import java.util.Scanner;

public class display_in_range 
{
   void display(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a start number and end number");
       int n = sc.nextInt();
       int n2 = sc.nextInt();
       display_in_range obj = new display_in_range();
       obj.display(n,n2);
       sc.close();
    } 
}
