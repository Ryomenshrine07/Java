//package Arrays;

import java.util.Scanner;

public class q1 
{
   public static void main(String[] args) 
   {
     int[] a = new int[25];
     int n,count=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the elements of array:");
     for(int i=0;i<25;i++)
     {
        a[i] = sc.nextInt();
     }
     System.out.println("Enter element to be searched in array");
     n=sc.nextInt();
     for(int i=0;i<25;i++)
     {
        if(a[i]==n)
        count++;
     }
     System.out.println("The element is present "+count+" times in this array.");
     sc.close();
   } 
}
