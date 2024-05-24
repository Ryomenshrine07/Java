package DSA_FSD6.Arrays;

import java.util.*;

public class FindDuplicates
{
    static int countZero = 0;
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static boolean checkIfPresent(int[] arr, int key)
    {
        if(key == 0 && countZero == 0)
        {
            countZero++;
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                return true;
            }
        }
        return false;
    }
    static ArrayList<Integer> findDuplicates(int[] arr)
    {
        int[] newArray = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            if(!checkIfPresent(newArray,arr[i]))
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                if(count>0)
                {
                    newArray[k++] = arr[i];
                }
            }
        }
        int[] arr2 = Arrays.copyOf(newArray,k);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(arr2.length == 0)
        {
            list.add(-1);
            return list;
        }
        for(int i : arr2)
        {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        ArrayList<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates Are : "+duplicates);
    }
}
