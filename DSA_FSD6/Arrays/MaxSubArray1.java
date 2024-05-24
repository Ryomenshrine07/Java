package DSA_FSD6.Arrays;

import java.util.Scanner;

public class MaxSubArray1
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
    static int findMaxSubArray(int[] arr,int k)
    {
        int sum = 0;
        int p = 0;
        int max = 0;
        for(int i=0;i<k&&k<=arr.length;i++)
        {
            sum = sum + arr[i];
            if(i == k-1)
            {
                if(sum > max)
                {
                    max = sum;
                }
                p++;
                i = p-1;
                k++;
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter Size of SubArray");
        int k = sc.nextInt();
        int max = findMaxSubArray(arr,k);
        System.out.println("Max SubArray is :"+max);
    }
}
