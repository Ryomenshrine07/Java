package Arrays;

import java.util.Scanner;

public class QuickPractice
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
    static void swapp(int []arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[]arr ,int low,int end)
    {
        int i = low - 1;
        int pivot = arr[end];
        for(int j=low;j<=end-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swapp(arr,i,j);
            }
        }
        swapp(arr, i+1, end);
        return i+1;
    }
    static void quickSort(int[] arr,int low,int end)
    {
        if(low < end)
        {
            int pivot = partition(arr,low,end);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,end);
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
