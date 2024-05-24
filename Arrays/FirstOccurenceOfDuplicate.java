package Arrays;

import java.util.Scanner;

public class FirstOccurenceOfDuplicate
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
    static int checkDuplicate(int[] arr , int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    return j;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int index = checkDuplicate(arr , n);
        if(index == -1)
        {
            System.out.println("No Duplicate Present");
        }
        else
        {
            System.out.println("Duplicate is Present at index : "+index);
        }
    }
}
