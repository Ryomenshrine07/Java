package DSA_FSD6.Arrays;

import java.util.Scanner;

public class RemoveDuplicateAtK
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
    static void removeDuplicates(int[] arr)
    {
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            int num = arr[i];
            if(k < 1 || num > arr[k-1])
            {
                arr[k++] = num;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        removeDuplicates(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
