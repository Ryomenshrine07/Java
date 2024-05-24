package Arrays;

import java.util.Scanner;

public class FirstLargest
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements Of Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findLargest(int[] arr)
    {
        int larg = 0;
        for (int j : arr)
        {
            if (j > larg)
            {
                larg = j;
            }
        }
        return larg;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int largest = findLargest(arr);
        System.out.println("Largest Element in Array is : "+largest);
    }
}
