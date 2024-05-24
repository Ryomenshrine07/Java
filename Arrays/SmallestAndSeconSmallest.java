package Arrays;

import java.util.Scanner;

public class SmallestAndSeconSmallest
{
    static void enterElements(long[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements Of Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static long findLargest(long[] arr)
    {
        long larg = 0;
        for (long j : arr)
        {
            if (j > larg)
            {
                larg = j;
            }
        }
        return larg;
    }
    static boolean checkIfPresentOrNot(long[] arr)
    {
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                flag = true;
            }
        }
        return flag;
    }
    static long[] findSmallestNSeconSmall(long[] arr)
    {
        boolean check = checkIfPresentOrNot(arr);
        if(check) {
            long small = arr[0];
            long secSmall = findLargest(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < small) {
                    small = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < secSmall && arr[i] > small) {
                    secSmall = arr[i];
                }
            }
            long[] newArr = new long[2];
            newArr[0] = small;
            newArr[1] = secSmall;
            return newArr;
        }
        else
        {
            long[] temp = new long[1];
            temp[0] = -1;
            return temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size For Array");
        int n = sc.nextInt();
        long[] arr = new long[n];
        enterElements(arr);
        long[] seconSmall = findSmallestNSeconSmall(arr);
        for(long i : seconSmall)
        {
            System.out.print(i+" ");
        }
    }
}
