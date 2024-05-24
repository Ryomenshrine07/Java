package Arrays;

import java.util.Scanner;

public class MaximumProductSubArray2
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int arrayProduct(int[] arr,int index)
    {
        int pro = 1;
        for(int i=index;i>=0;i--)
        {
            pro = pro * arr[i];
        }
        return pro;
    }
    static int largestInArray(int[] arr)
    {
        int larg = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > larg)
            {
                larg = arr[i];
            }
        }
        return larg;
    }
    static int findMaxProduct(int[] nums)
    {
        int largest = largestInArray(nums);
        for(int i=0;i<nums.length;i++)
        {
            int pro = nums[i];
            for(int j=i+1;j< nums.length;j++)
            {
                pro = pro * nums[j];
                largest = pro>largest?pro:largest;
            }
        }
        if(nums.length == 1)
        {
            return nums[0];
        }
        else {
            return largest;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int maxProduct = findMaxProduct(arr);
        System.out.println("Maximum Product of Sub Array is : "+maxProduct);
    }
}
