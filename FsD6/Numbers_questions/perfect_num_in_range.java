package
        FsD6.Numbers_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class perfect_num_in_range 
{
    void display(int start,int end)
    {
        int sum;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            sum = 0;
            for(int j=1;j<i;j++)
            {
                if(i % j == 0)
                sum = sum + j;
            }
        if(sum == i)
        list.add(i);
        }
        System.out.println("All Perfect numbers in the given range are :");
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a start and a end number");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       perfect_num_in_range obj = new perfect_num_in_range();
       obj.display(n,n1);
       sc.close();
    }
}
