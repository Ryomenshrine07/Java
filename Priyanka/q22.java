package Priyanka;

import java.util.Scanner;

public class q22 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int i,j;
         for(i=1;i<=n;i++)
         {
          for(j=1;j<=i;j++)
          {
          System.out.print(j+" ");
          }
          for(j=n;j>i;j--)
          {
          System.out.print(" ");
          }
         for(j=n;j>i;j--)
         {
         System.out.print("   ");
         }
         for(j=i;j>=1;j--)
         {
          System.out.print(j+" ");
         }
         System.out.println();
         }
       }


  }  

