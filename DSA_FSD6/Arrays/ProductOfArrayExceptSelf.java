package DSA_FSD6.Arrays;

import java.util.Scanner;

public class ProductOfArrayExceptSelf
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
    static int[] getProductArray(int[] nums)
    {
        int maxProduct = 1;
        int zero = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                zero++;
            }
            else
            {
                maxProduct = maxProduct * nums[i];
            }
        }
        int[] temp = new int[nums.length];
        if(zero > 1)
        {
            return temp;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero>0)
            {
                if(nums[i] != 0)
                {
                    temp[i] = 0;
                }
                else
                {
                    temp[i] = maxProduct;
                }
            }
            else
            {
                temp[i] = (maxProduct / nums[i]);
            }
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        int[] productArray = getProductArray(arr);
        for(int i : productArray)
        {
            System.out.print(i+" ");
        }
    }
}
