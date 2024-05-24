package DSA_FSD6.Arrays;

import java.util.Scanner;

public class BinarySearch
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            arr[i] =  sc.nextInt();
        }
    }
    static int searchElement(int[] arr ,int n)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start < end)
        {
            mid = (start + end) / 2;
            if(arr[mid] == n)
            {
                return mid;
            }
            else if(arr[mid]>n)
            {
                end = mid - 1;
            }
            else if(arr[mid]<n)
            {
                start = mid + 1;
            }
        }
        return  mid;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);

        System.out.println("Enter Element To be Searched");
        int num = sc.nextInt();

        int index = searchElement(arr, num);

        if(index>0)
        {
            System.out.println("Element is at index :"+index);
        }
        else
        {
            System.out.println("Element is not Present");
        }
    }
}
