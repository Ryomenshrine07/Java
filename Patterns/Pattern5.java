package Patterns;

import java.util.Scanner;

public class Pattern5 
{
  public static void main(String[] args) 
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=n-1;j>=i;j--)
        {
            System.out.print("*");
        }
        for(j=n;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
