package DSA_FSD6.Arrays;

import java.util.Scanner;

public class QuickSortAlogrithm
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partion(int[] arr, int low,int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partion(arr,low,high);
            System.out.println("Partition Done....");
            quickSort(arr,low,pivot-1);
            System.out.println("QuickSort 1 Finished....");
            quickSort(arr,pivot+1,high);
            System.out.println("QuickSort 2 Finished....");
        }
    }
    static void displayArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        quickSort(arr, 0, arr.length-1);
        displayArray(arr);
    }
}
