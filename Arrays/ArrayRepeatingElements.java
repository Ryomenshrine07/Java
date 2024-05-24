package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayRepeatingElements
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
    static boolean containElementOrNot(int[] arr, int n)
    {
        boolean flag = false;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] == n)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
    static int[] findRepeatingElements(int[] arr)
    {
        int[] repeat = new int[arr.length];
        boolean flag = false;
        int k = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            count = 1;
            if(!containElementOrNot(repeat,arr[i]))
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        flag = true;
                        count++;
                        break;
                    }
                }
                if(flag && count > 1)
                {
                    repeat[k++] = arr[i];
                }
            }
        }
        List<int[]> list = Arrays.asList(repeat);
        return Arrays.copyOf(repeat,k);
    }
    static void display(int[] arr)
    {
        System.out.println("Repeated Elements Are :");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] repeat = findRepeatingElements(arr);
        display(repeat);
    }
}
