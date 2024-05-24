package DSA_FSD6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HIndex
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Array Elements [Citations]");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findHIndex(int[] citations)
    {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++)
        {
            if(citations[i] >= citations.length - i)
            {
                return citations.length - i;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        int hIndex = findHIndex(arr);
        System.out.println("H-Index is : "+hIndex);
    }
}
