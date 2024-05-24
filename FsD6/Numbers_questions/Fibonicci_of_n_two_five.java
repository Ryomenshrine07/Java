package Numbers_questions;

import java.util.Scanner;

public class Fibonicci_of_n_two_five 
{
   void display(int a,int b,int c,int i,int n)
    {
        if(i<=n-2)
        {
            if(i==1)
            {
                System.out.print(a+" "+b+" ");
            }
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
            display(a, b, c, i, n);
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Fibonicci_of_n_two_five obj = new Fibonicci_of_n_two_five();
       int a = 2, b = 5, c = 0, i = 1;
       obj.display(a,b,c,i,n);
       sc.close();
    } 
}
