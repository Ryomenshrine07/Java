package Priyanka;

import java.util.Scanner;

public class q26 
{
  public static void main(String[] args) 
  {
    int i,j,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Num");
    n=sc.nextInt();
    sc.close();
    for(i=1;i<=n;i++)
    {
        int c=n;
        for(j=1;j<=i;j++)
        {
            System.out.print((char)(c+64)+" ");
            c--;
        }
        System.out.println();
    }
  }  
}
