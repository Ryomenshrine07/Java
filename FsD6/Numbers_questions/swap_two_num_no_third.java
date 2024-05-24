package Numbers_questions;

import java.util.Scanner;

public class swap_two_num_no_third 
{
    void display(int a,int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping :");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b); 
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers for a and b");
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       swap_two_num_no_third obj = new swap_two_num_no_third();
       obj.display(n,n1);
       sc.close();
    }
}
