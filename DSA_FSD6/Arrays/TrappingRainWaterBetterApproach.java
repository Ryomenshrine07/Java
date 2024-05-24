package DSA_FSD6.Arrays;

import java.util.Scanner;

public class TrappingRainWaterBetterApproach
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
    static int calculateTrappedWater(int[] height)
    {
        int[] leftHeight = new int[height.length];
        int[] rightHeight = new int[height.length];
        leftHeight[0] = height[0];
        for(int i=1;i<height.length;i++)
        {
            leftHeight[i] = Math.max(leftHeight[i-1],height[i]);
        }
        rightHeight[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightHeight[i] = Math.max(rightHeight[i+1],height[i]);
        }
        int sum = 0;
        for(int i=0;i<height.length;i++)
        {
            sum = sum + Math.min(leftHeight[i],rightHeight[i]) - height[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int trappedWater = calculateTrappedWater(arr);
        System.out.println("Trapped Water is :"+trappedWater);
    }
}
