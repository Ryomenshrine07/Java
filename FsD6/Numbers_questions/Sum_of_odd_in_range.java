package Numbers_questions;

import java.util.Scanner;

public class Sum_of_odd_in_range 
{
   void find(int start,int end)
    {
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            if(i%2!=0)
            sum = sum + i;
        }
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a start number and end number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       Sum_of_odd_in_range obj = new Sum_of_odd_in_range();
       obj.find(n,n1);
       sc.close();
    } 
}
