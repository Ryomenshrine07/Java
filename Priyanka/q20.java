package Priyanka;

import java.util.Scanner;

public class q20 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
      System.out.print("* ");
      }
      System.out.println();
    }
    for(i=1;i<n;i++)
    {
    for(j=n-1;j>=i;j--)
    {
      System.out.print("* ");
    }
    System.out.println();
    }   
   
   } 

}  
