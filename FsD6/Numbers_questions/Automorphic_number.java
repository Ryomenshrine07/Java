// Given a number N, the task is to check whether the number is an Automorphic number or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

import java.util.Scanner;

public class Automorphic_number 
{
   void display(int n)
    {
        int count = 1,c = n;
        while(c!=0)
        {
            count++;
            c = c / 10; 
        }
        int square = n * n;
        int num = square % (10 * count);
        if(n == num)
        System.out.println(n+" is a Automorphic number");
        else
        System.out.println(n+" is not a Automorphic number");
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Automorphic_number obj = new Automorphic_number();
       obj.display(n);
       sc.close();
    } 
}
