package DSA_FSD6.Arrays;

import java.util.Scanner;

public class ShuffleTheArray
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int[] shuffleTheArray(int[] arr , int shuff)
    {
        int n = shuff;
        int[] shuffArray = new int[arr.length];
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(i % 2 == 0)
            {
                shuffArray[i] = arr[k++];

            }
            else
            {
                shuffArray[i] = arr[n++];
            }
        }
        return shuffArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        System.out.println("Enter no. of Times You want to Shuffle");
        int shuff = sc.nextInt();
        int[] shuffleArray = shuffleTheArray(arr,shuff);
        System.out.println("Shuffled Array is :");
        for(int i : shuffleArray)
        {
            System.out.print(i+" ");
        }
    }
}
