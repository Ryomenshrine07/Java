package Numbers_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class prime_upto_n_alter 
{
    void display(int start,int end)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 2;
        for(int i=start;i<=end;i++)
        {
            int j;
            for(j=2;j<=i;j++)
            {
                if(i % j == 0)
                break;
            }
            if(i == j || i == 1)
            {
                if(count % 2 ==0)
                {
                    list.add(i);
                }
                count++;
            }
        }
        System.out.println("Alternate prime numbers in the given range are :");
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a start and a end number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       prime_upto_n_alter obj = new prime_upto_n_alter();
       obj.display(n,n1);
       sc.close();
    }
}
