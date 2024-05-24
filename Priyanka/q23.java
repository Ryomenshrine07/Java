package Priyanka;

import java.util.Scanner;

public class q23 
{
  public static void main(String[] args) 
  {
    int i,j,a=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
    }
  }  
}
