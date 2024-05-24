package Patterns;

import java.util.Scanner;

public class Pattern53 
{
    static void display(int n)
    {
      for(int i=1;i<=n;i++)
      {
        if(i<=(n/2)+1)
        {
        for(int j=1;j<=(n/2)+1-i;j++)
        {
          System.out.print("*");
        }
        for(int j=1;j<=2*i-1;j++)
        {
          if(j == 1 || j == 2*i-1)
          {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        for(int j=i;j<=(n/2);j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      else
      {
        for(int j=(n/2)+1;j<i;j++)
        {
          System.out.print("*");
        }
        for(int j=1;j<=2*(n-i)+1;j++)
        {
          if(j == 1 || j == 2*(n-i)+1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        for(int j=(n/2)+1;j<=i-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
    }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    display(n);
    sc.close();
  }
}
