package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNonRepeatElement
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
    static int[] findNonRepeatingElements(int[] arr)
    {
        int[] nonRepeat = new int[arr.length];
        boolean flag = false;
        int k = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            if(arr[i] == 0)
            {
                continue;
            }
            if(!containElementOrNot(nonRepeat,arr[i]))
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] != arr[j])
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                        arr[j] = 0;
                        break;
                    }
                }
                if(flag)
                {
                    nonRepeat[k++] = arr[i];
                }
            }
        }
        return Arrays.copyOf(nonRepeat,k);
    }
    static void display(int[] arr)
    {
        System.out.println("Non Repeated Elements Are :");
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
        int[] repeat = findNonRepeatingElements(arr);
        display(repeat);
    }
}
