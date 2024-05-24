package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPallindrome
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
    static int[] makeLongestPallinArray(int[] arr)
    {
        int[] pallinArr = new int[arr.length];
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            int rev = 0;
            int n = arr[i];
            while(n!=0)
            {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            }
            if(rev == arr[i])
            {
                pallinArr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(pallinArr,k);
    }
    static int findLongestPallindrome(int[] arr)
    {
        int larg = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] > larg)
            {
                larg = arr[i];
            }
        }
        return larg;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] pallinArray = makeLongestPallinArray(arr);
        int longPallin = findLongestPallindrome(pallinArray);
        System.out.println("Largest Pallindrome in Array is :"+longPallin);
    }
}
