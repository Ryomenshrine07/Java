package DSA_FSD6.Arrays;

import java.util.Scanner;

public class GoodPairs
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
    static int countGoodPairs(int[] nums)
    {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int GPairs = countGoodPairs(arr);
        System.out.println("Number Of Good Pairs Are :"+GPairs);
    }
}
