package DSA_FSD6.Arrays;

import java.util.Scanner;

public class CountNoSmaller
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
    static int[] countNoGreater(int[] arr)
    {
        int[] countArray = new int[arr.length];
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            int count = 0;
            for(int j=0;j< arr.length;j++)
            {
                if (i != j)
                {
                    if (arr[i] > arr[j])
                    {
                        count++;
                    }
                }
            }
            countArray[k++] = count;
        }
        return countArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] countArray = countNoGreater(arr);
        System.out.println("Count Array is : ");
        for(int i : countArray)
        {
            System.out.print(i+" ");
        }
    }
}
