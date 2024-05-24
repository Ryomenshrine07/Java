package DSA_FSD6.Arrays;

import java.util.Scanner;

public class BuySellStockMaxProfit2
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Array Elements [Prices]");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findMaxProfit(int[] arr)
    {
        int buy = arr[0];
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(buy > arr[i])
            {
                buy = arr[i];
            }
            else
            {
                maxProfit = maxProfit + (arr[i]-buy);
                buy = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        enterElement(arr);
        int maxProfit = findMaxProfit(arr);
        System.out.println("Maximum Profit will be :"+maxProfit);
    }
}
