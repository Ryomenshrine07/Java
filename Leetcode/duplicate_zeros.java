package Leetcode;

import java.util.Scanner;

public class duplicate_zeros 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;)
      {
          
          if(arr[i]==0)
          {
              for(int j=arr.length-1;j>i;j--)
              {
              arr[j]=arr[j-1];
              }
              i=i+2;
          }
          else
          {
              i++;
          }
      }
      System.out.println("Result is :");
      for (int j : arr) {
          System.out.print(j + " ");
      }
          sc.close();
  }  
}
