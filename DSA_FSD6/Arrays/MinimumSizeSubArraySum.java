package DSA_FSD6.Arrays;

import java.util.Scanner;

public class MinimumSizeSubArraySum
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
    static int findMinimumSubArraySumSize(int target, int[] nums)
    {
        int i = 0;
        int j = 0;
        int currentSum = 0;
        int minSize = Integer.MAX_VALUE;
        while (i < nums.length)
        {
            if (currentSum >= target)
            {
                minSize = Math.min(minSize, j - i); // Update minSize
                currentSum = currentSum - nums[i]; // Move window by decrementing currentSum
                i++;
            }
            else if (j < nums.length)
            {
                currentSum = currentSum + nums[j]; // Expand window
                j++;
            }
            else
            {
                break; // Reached the end of the array
            }
        }
        // If minSize is still Integer.MAX_VALUE, no subarray found
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        System.out.println("Enter Target Value :");
        int target = sc.nextInt();
        int minSumSize = findMinimumSubArraySumSize(target,arr);
        System.out.println("Maximum Sum is :"+minSumSize);
    }
}
