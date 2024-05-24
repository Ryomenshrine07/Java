// A number is said to be a Peterson number if the sum of factorials of each digit of the number is equal to the number itself.

import java.util.Scanner;

public class Peterson_number 
{
    void display(int n)
    {
        int d,sum = 0,f,c = n;
        while(c!=0)
        {
            f = 1;
            d = c % 10;
            for(int i=1;i<=d;i++)
            f = f * i;
            sum = sum + f;
            c = c / 10;
        }
        if(sum == n)
        System.out.println(n+" is a Peterson Number");
        else
        System.out.println(n+" is not a Peterson Number");
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Peterson_number obj = new Peterson_number();
       obj.display(n);
       sc.close();
    }
}
