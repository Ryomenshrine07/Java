package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SubSetOrNot
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
    static boolean checkSubSetOrNot(int[] arr1,int[] arr2)
    {
        LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
        for(int i : arr1)
        {
            hs1.add(i);
        }
        for(int i : arr2)
        {
            hs2.add(i);
        }
        boolean flag = hs1.retainAll(hs2);
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array :");
        int n = sc.nextInt();
        System.out.print("Enter Size of Second Array :");
        int n2 = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n2];
        enterElements(arr);
        enterElements(arr2);
        boolean flag = checkSubSetOrNot(arr,arr2);
        if(flag)
        {
            System.out.println("Array 2 is Subset of Array 1");
        }
        else
        {
            System.out.println("Array 2 is Not a Subset of Array 1");
        }
    }
}
