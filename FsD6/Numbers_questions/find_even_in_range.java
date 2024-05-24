package FsD6.Numbers_questions;

import java.util.Scanner;

public class find_even_in_range 
{
   void find(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a start number and end number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       find_even_in_range obj = new find_even_in_range();
       obj.find(n,n1);
       sc.close();
    } 
}
