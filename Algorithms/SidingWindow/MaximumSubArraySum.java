package Algorithms.SidingWindow;

import java.util.Scanner;

public class MaximumSubArraySum
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
    static int findMaximumSubArray(int[] nums, int k)
    {
        int maxSum = 0;
        for(int i=0;i<k;i++)
        {
            maxSum = maxSum + nums[i];
        }
        int currentSum = maxSum;
        for(int i=k;i<nums.length;i++)
        {
            currentSum = currentSum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
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
        int maxSum = findMaximumSubArray(arr,k);
        System.out.println("Maximum Sum is :"+maxSum);
    }
}
