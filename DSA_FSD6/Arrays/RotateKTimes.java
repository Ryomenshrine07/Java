package DSA_FSD6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateKTimes
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void rotateArray(int[] nums,int k)
    {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        int k2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                temp[i] = nums[nums.length+i-k];
            }
            else
            {
                temp[i] = nums[i-k];
            }
        }
        for(int i : temp)
        {
            nums[k2++] = i;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter No. Of Rotations :");
        int k = sc.nextInt();
        rotateArray(arr,k);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
