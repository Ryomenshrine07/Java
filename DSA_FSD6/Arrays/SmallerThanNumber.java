package DSA_FSD6.Arrays;

import java.util.*;

public class SmallerThanNumber
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
    static ArrayList<Integer> countSmallNumbers(int[] arr)
    {

        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i : arr)
        {
            hMap.put(i, hMap.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hMap.entrySet())
        {
            if(entry.getKey() > 1)
            {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        ArrayList<Integer> countSmall = countSmallNumbers(arr);
        System.out.println(countSmall);
    }
}
