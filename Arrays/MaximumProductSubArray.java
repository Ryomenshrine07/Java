package Arrays;

import java.util.Scanner;

public class MaximumProductSubArray
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
    static int arrayProduct(int[] arr)
    {
        int pro = 1;
        for(int i=0;i<arr.length;i++)
        {
            pro = pro * arr[i];
        }
        return pro;
    }
    static int largestInArray(int[] arr)
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
    static int findMaxProduct(int[] arr)
    {
        int mid = 0;
        if(arr.length == 1)
        {
            return arr[0];
        }
        else if(arr.length % 2 == 0)
        {
            mid = (arr.length / 2) - 1;
        }
        else
        {
            mid = (arr.length / 2);
        }
        int i = 0,p1 = 1,p2 = 1,p3 = 1,largSub = largestInArray(arr);
        int j = mid;
        while(i<=mid || j<arr.length)
        {
            p1 = p1 * arr[i];
            if(j<arr.length)
            {
                p2 = p2 * arr[j];
                j++;
            }
            largSub = p1>p2?(p1>largSub?p1:largSub):(p2>largSub?p2:largSub);
            if(p1 == 0)
            {
                p1 = 1;
            }
            if(p2 == 0)
            {
                p2 = 1;
            }
            i++;
        }
        int ArrayPro = arrayProduct(arr);
        return ArrayPro>largSub?ArrayPro:largSub;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int maxProduct = findMaxProduct(arr);
        System.out.println("Maximum Product of Sub Array is : "+maxProduct);
    }
}
