//package Leetcode;

import java.util.Scanner;

public class Even_digits 
{
  public static void main(String[] args) 
  {
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int nums[] = new int[n];
    System.out.println("enter Array Elements");
    for(int i=0;i<nums.length;i++)
    {
        nums[i] = sc.nextInt();
    }
    for(int i=0;i<nums.length;i++)
    {
        int count=0;
        int num =nums[i];
        while(num!=0)
        {
            int d = num%10;
            count++;
            num=num/10;
        }
        if(count%2==0)
        sum=sum+1;
    }
    System.out.println("Total numbers with even digits are: "+sum);
    sc.close();
  }  
}
