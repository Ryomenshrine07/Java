package DSA_FSD6.Arrays;

import java.util.*;

public class KthMaximum
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
    static int findKthMax(int[] arr, int k)
    {
        TreeSet<Integer> TSet = new TreeSet<>();
        for(int i : arr)
        {
            TSet.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = TSet.iterator();
        while(it.hasNext())
        {
            list.add(it.next());
        }
        Collections.sort(list);
        System.out.println(list);
        return list.get(list.size()-k);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter Value of K :");
        int k = sc.nextInt();
        int element = findKthMax(arr,k);
        System.out.println("Kth Max Element is "+element);
    }
}
