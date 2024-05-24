package DSA_FSD6.Arrays;

import java.util.Scanner;

public class ConcatinationOfArray
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
    static int[] concatinate(int[] arr)
    {
        int[] newArr = new int[2* arr.length];
        for(int i=0;i<arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        for(int i=0;i< arr.length;i++)
        {
            newArr[arr.length+i] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] newArr = concatinate(arr);
        System.out.println("Concatinated Array is :");
        for(int i : newArr)
        {
            System.out.print(i+" ");
        }
    }
}
