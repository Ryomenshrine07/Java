package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountDistinctElements
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
    static int[] removeDuplicates(int[] arr)
    {
        int[] new_arr = new int[arr.length];
        boolean flag = false;
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] != new_arr[j])
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            {
                new_arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(new_arr,k);
    }
    static int countDistinctElements(int[] arr)
    {
        return arr.length;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] elements = removeDuplicates(arr);
        int count = countDistinctElements(elements);
        System.out.println("Number Of Distinct Elements are :"+count);
    }
}
