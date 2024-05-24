// A number is called a sunny number if the number next to the given number is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.

import java.util.Scanner;

public class Sunny_number 
{
   void display(int n)
    {
        int num = n + 1,flag = 0;
        for(int i=1;i<=num;i++)
        {
            if(num % i == 0 && i * i == num)
            flag = 1;
        }
        if(flag == 1)
        System.out.println(n+" is a Sunny Number");
        else
        System.out.println(n+" is not a Sunny Number");
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Sunny_number obj = new Sunny_number();
       obj.display(n);
       sc.close();
    } 
}
