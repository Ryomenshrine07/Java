package DSA_FSD6.Arrays;

import java.util.Scanner;

public class TrappingRainWaterBruteForce
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
        int sum = 0;
        for(int i=0;i<height.length;i++)
        {
            int leftHeight = height[i];
            for(int j=0;j<i;j++)
            {
                leftHeight = Math.max(leftHeight,height[j]);
            }
            int rightHeight = height[i];
            for(int j=i+1;j<height.length;j++)
            {
                rightHeight = Math.max(rightHeight,height[j]);
            }
            int maxWaterHeight = Math.min(leftHeight,rightHeight);
            sum = sum + maxWaterHeight - height[i];
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
