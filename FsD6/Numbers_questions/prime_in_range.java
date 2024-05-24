package Numbers_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class prime_in_range 
{
    void display(int start,int end)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            int j;
            for(j=2;j<=i;j++)
            {
                if(i % j == 0)
                break;
            }
            if(j == i || i == 1)
            list.add(i);
        }
        System.out.println("Prime numbers in the given range are");
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Start and a End number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       prime_in_range obj = new prime_in_range();
       obj.display(n,n1);
       sc.close();
    }
}
