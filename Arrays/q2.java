//package Arrays;

import java.util.Scanner;

public class q2 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    int[] a= new int[25];
    int e=0,o=0,p=0,n=0;
    System.out.println("Enter elements in array");
    for(int i=0;i<25;i++)
    {
        a[i] = sc.nextInt();
        if(a[i]>0)
        p++;
        else
        n++;
        if(a[i]%2==0)
        e++;
        else
        o++;
    }
    System.out.println("Positive numbers entered :"+p);
    System.out.println("Negative numbers entered :"+n);
    System.out.println("Even numbers entered :"+e);
    System.out.println("Odd numbers entered :"+o);
    sc.close();
  }  
}
