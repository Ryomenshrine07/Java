package Numbers_questions;

import java.util.Scanner;

public class Binary_to_decimal 
{
    void display(int n)
    {
        int d,i=0,c=n;
        double sum = 0;
        while(n!=0)
        {
            d = n % 10; 
            sum = sum + Math.pow(2, i) * d;
            i++;
            n = n / 10;
        }
        System.out.println("Decimal Equivalent Of "+c+" Is : "+(int)sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Binary_to_decimal obj = new Binary_to_decimal();
       obj.display(n);
       sc.close();
    }
}
