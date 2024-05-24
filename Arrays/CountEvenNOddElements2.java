package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountEvenNOddElements2
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
    static int countOddElements(int[] arr)
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for(int i=0;i< arr.length;i++)
        {
            hs.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(hs);
        int count = 0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    static int countEvenElements(int[] arr)
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for(int i=0;i< arr.length;i++)
        {
            hs.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(hs);
        int count = 0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) % 2 != 0)
            {
                count++;
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
