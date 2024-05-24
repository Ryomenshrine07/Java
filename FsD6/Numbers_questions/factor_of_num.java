//package Numbers_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class factor_of_num 
{
    void display(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            list.add(i);
        }
        System.out.println("factors of "+n+" are:");
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       factor_of_num obj = new factor_of_num();
       obj.display(n);
       sc.close();
    }
}
