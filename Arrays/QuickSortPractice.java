package Arrays;

import java.util.Scanner;

public class QuickSortPractice {
    static void enterElements(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void swap(int[] arr, int index1, int index2)
    {
        int t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
    }
    static int partition(int[] arr, int low, int high)
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
            int mid = partition(arr, low, high);
            quickSort(arr, low, mid-1);
            quickSort(arr, mid+1, high);
        }
    }
    static void displayArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
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
