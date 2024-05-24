package DSA_FSD6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int candidateElement(int nums[])
    {
        Arrays.sort(nums);
        if(nums.length == 1)
        {
            return nums[0];
        }
        int index = 0;
        int count = 1;
        int last = 0;
        for(int i=1;i< nums.length;i++)
        {
            if(nums[index] == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                count = 1;
                index = i;
            }
            if (count > 1)
            {
               boolean flag = majorityElement(nums,nums[index]);
               if(flag)
               {
                   return nums[index];
               }
               else
               {
                   continue;
               }
            }
        }
        return -1;
    }
    static boolean majorityElement(int[] arr ,int n)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                count++;
            }
        }
        if(count > (arr.length/2))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        enterElement(arr);
        int candidate = candidateElement(arr);
        System.out.println("Majority Element is :"+candidate);
    }
}
