package Arrays;

import java.util.Scanner;

public class CountEvenNOddElements
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
    static boolean checkPresentOrNot(int[] arr ,int n)
    {
        boolean flag = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
    static int countEvenElements(int[] arr)
    {
        int count = 0;
        int[] elements = new int[arr.length];
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(!checkPresentOrNot(elements,arr[i]))
            {
                if(arr[i] % 2 == 0)
                {
                    count++;
                }
                elements[k++] = arr[i];
            }

        }
        return count;
    }
    static int countOddElements(int[] arr)
    {
        int count = 0;
        int[] elements = new int[arr.length];
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(!checkPresentOrNot(elements,arr[i]))
            {
                if(arr[i] % 2 != 0)
                {
                    count++;
                }
                elements[k++] = arr[i];
            }

        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int evenNo = countEvenElements(arr);
        int oddNo = countOddElements(arr);
        System.out.println("Total No. Of Even Numbers are :"+evenNo);
        System.out.println("Total No. Of Odd Numbers are :"+oddNo);
    }
}
