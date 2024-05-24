package Arrays;

import java.util.Scanner;

public class BubbleSort
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
    static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        bubbleSort(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
