package Priyanka;

import java.util.Scanner;

public class q19 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n=sc.nextInt();
    int i,j;
        char ch='A';                        
        for(i=1;i<=n;i++)
        {
        for(j=n;j>i;j--)
        {
        System.out.print(" ");
        }
        for(j=1,ch='A';j<=i;j++)
        {
        System.out.print(ch);
        ch++;
        }
        for(j=i-1;j>=1;j--)
        {
            System.out.print((char)(j+64));
        }
        System.out.println();
        }

  }  
}
