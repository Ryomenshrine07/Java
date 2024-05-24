package FsD6.Numbers_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCD_btween_two 
{
    void display(int a,int b)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int small = a<b?a:b;
        for(int i=1;i<=small;i++)
        {
            if(a % i == 0 && b % i == 0)
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.print("GCD of "+a+" and "+b+" is :"+list.get(0));
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       GCD_btween_two obj = new GCD_btween_two();
       obj.display(n,n1);
       sc.close();
    }
}
