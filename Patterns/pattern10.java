//package Patterns;

import java.util.Scanner;

public class pattern10 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=n;j>=i;j--)
            {
                if(j%2!=0)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                if(j%2!=0||j==1)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
  }   
}
