package DSA_FSD6.Arrays;

import java.util.Scanner;

public class LeftAndRightSumDiff
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int[] leftSum(int[] arr)
    {
        int[] lSum = new int[arr.length];
        int sum = 0;
        for(int i=0;i<lSum.length;i++)
        {
            lSum[i] = sum;
            sum = sum + arr[i];
        }
        return lSum;
    }
    static int[] rightSum(int[] arr)
    {
        int[] rSum = new int[arr.length];
        int sum = 0;
        for(int i=rSum.length-1;i>=0;i--)
        {
            rSum[i] = sum;
            sum = sum + arr[i];
        }
        return rSum;
    }
    static int[] leftAndRightSumDiff(int[] nums)
    {
        if(nums.length == 1)
        {
            nums[0] = 0;
            return nums;
        }
        int[] lSum = leftSum(nums);
        int[] rSum = rightSum(nums);
        int[] lAndRDiff = new int[nums.length];
        for(int i=0;i<lAndRDiff.length;i++)
        {
            lAndRDiff[i] = Math.abs(lSum[i] - rSum[i]);
        }
        return lAndRDiff;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] lAndRSum = leftAndRightSumDiff(arr);
        System.out.print("Difference is :");
        for(int i : lAndRSum)
        {
            System.out.print(i+" ");
        }

    }
}
