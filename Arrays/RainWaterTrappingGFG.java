package Arrays;

import java.util.Scanner;

public class RainWaterTrappingGFG
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
    static int findMax(int[] arr)
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
    static int findSum(int[] arr, int max)
    {
        int sum = 0;
        for(int i=1;i<arr.length-1;i++)
        {
            sum = sum + (max - arr[i]);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int max = findMax(arr);
        int sum = findSum(arr , max);
        System.out.println("Sum is :"+sum);
    }
}
