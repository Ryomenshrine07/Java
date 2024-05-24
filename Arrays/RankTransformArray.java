package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RankTransformArray
{
    static int checkZero = 0;
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
        if(num == 0 && checkZero == 0)
        {
            checkZero++;
            return true;
        }
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
    static int[] findRankedArray(int[] arr)
    {
        int[] tempArray = new int[arr.length];
        int k = 0;
        for (int j : arr) {
            if (!checkElementPresent(tempArray, j)) {
                tempArray[k++] = j;
            }
        }
        tempArray = Arrays.copyOf(tempArray,k);
        int[] rankedArray = new int[arr.length];
        k = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count = 1;
            for(int j=0;j< tempArray.length;j++)
            {
                if(arr[i] > tempArray[j])
                {
                    count++;
                }
            }
            rankedArray[k++] = count;
        }
        rankedArray = Arrays.copyOf(rankedArray,k);
        return rankedArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] rankedArray = findRankedArray(arr);
        for(int i : rankedArray)
        {
            System.out.print(i+" ");
        }
    }
}
