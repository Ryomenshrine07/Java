package DSA_FSD6.Arrays;

import java.util.Scanner;

public class SearchInsertPosition
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
    static int findInsertPosition(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        if(nums.length == 1)
        {
            if(nums[0] > target)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        int insertPosition = 0;
        int greatest = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(target >= nums[i-1] && target <= nums[i] || target >= nums[i-1] && target >= nums[i])
            {
                insertPosition++;
            }
            if(target >= nums[i-1] && target >= nums[i])
            {
                greatest++;
            }
        }
        if(greatest == nums.length-1)
        {
            return nums.length;
        }
        else
        {
            return insertPosition;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        int insertPosition = findInsertPosition(arr,target);
        System.out.println("Position is :"+insertPosition);
    }
}
