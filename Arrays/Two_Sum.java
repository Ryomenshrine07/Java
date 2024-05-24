package Arrays;

import java.util.Scanner;
public class Two_Sum 
{
    public static void main(String[] args) 
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter size of array");
       int n = sc.nextInt();
       int[] nums = new int[n];
       System.out.println("Enter array elements");
       for(int i=0;i<nums.length;i++)
       {
         nums[i] = sc.nextInt();
       }
       int[] k = new int[2];
       System.out.println("Enter target value");
       int target = sc.nextInt();
       for(int i=0,m=0;i<nums.length&&m!=1;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                k[m]=i;
                m++;
                k[m]=j;
                break;
            }
        }
       }
       for(int i=0;i<k.length;i++)
       {
         System.out.print(k[i]+" ");
       }
       sc.close(); 
    }
}
