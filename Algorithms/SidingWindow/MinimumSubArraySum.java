package Algorithms.SidingWindow;

import java.util.Scanner;

public class MinimumSubArraySum
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findMinimumSubArray(int[] nums, int k)
    {
        int minSum = 0;
        for(int i=0;i<k;i++)
        {
            minSum = minSum + nums[i];
        }
        int currentSum = minSum;
        for(int i=k;i<nums.length;i++)
        {
            currentSum = currentSum + nums[i] - nums[i-k];
            minSum = Math.min(minSum,currentSum);
        }
        return minSum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        System.out.println("Enter SubArray Size :");
        int k = sc.nextInt();
        int minSum = findMinimumSubArray(arr,k);
        System.out.println("Maximum Sum is :"+minSum);
    }
}
