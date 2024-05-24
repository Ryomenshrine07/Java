package Priyanka;

import java.util.Scanner;

public class q27 
{
  public static void main(String[] args) 
  {
    int i,j,n;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=n;j>=i;j--)
        {
            System.out.print("*");
        }
         for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
         for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=n;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(j=i;j<n;j++)
        {
            System.out.print(" ");
        }
        for(j=i;j<n;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
