// Note: A Tech number is a number that has an even number of digits and if the number is split into two equal halves(From the middle), then the square of the sum of these halves is equal to the number itself.

package Numbers_questions;

import java.util.Scanner;

public class Tech_Number 
{
    void display(int n)
    {
        int count = 0,c = n,sum = 0;
        while(c!=0)
        {
            count++;
            c = c /10;
        }
        if(count % 2 == 0)
        {
            int h1 = n % 10 *(count / 2);
            int h2 = n / 10 *(count / 2);
            sum = (int)(Math.pow(h1+h2, 2));
        }
        if(sum == n)
        System.out.println(n+" is a Tech Number");
        else
        System.out.println(n+" is not a Tech Number");

    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Tech_Number obj = new Tech_Number();
       obj.display(n);
       sc.close();
    }
}
