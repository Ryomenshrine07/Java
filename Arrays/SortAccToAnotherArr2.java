package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAccToAnotherArr2
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
    static boolean checkElementPresent(int[] arr , int num)
    {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
    static int[] sortArray(int[] arr1,int[] arr2)
    {
        int[] sortedArray = new int[arr1.length];
        int k = 0;
        for (int value : arr2)
        {
            for (int i : arr1) {
                if (value == i) {
                    sortedArray[k++] = value;
                }
            }
        }
        int startIndex = k;
        int[] copyArray = Arrays.copyOf(sortedArray,k);
        for(int i=0;i<sortedArray.length;i++)
        {
            if(!checkElementPresent(copyArray,arr1[i]))
            {
                sortedArray[k++] = arr1[i];
            }
        }
        for(int i = startIndex;i<sortedArray.length;i++)
        {
            for(int j=i+1;j<sortedArray.length;j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter Second Array Size");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        enterElements(arr2);
        int[] sortedArray = sortArray(arr,arr2);
        for(int i : sortedArray)
        {
            System.out.print(i+" ");
        }
    }
}
