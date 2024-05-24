//package Arrays;

import java.util.Scanner;

public class q3 
{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter elements for your array :");
    for(int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    int b[] = new int[n];
    System.out.println("Reversed array is :");
    for(int i=0;i<n;i++)
    {
        b[i]=a[(n-1)-i];
        System.out.println(b[i]);
    }
    sc.close();
  }  
}
