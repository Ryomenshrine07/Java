package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SortAccToAnotherArr
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
    static int[] sortArray(int[] arr1,int[] arr2)
    {
        int[] sortedArray = new int[arr1.length];
        ArrayList<Integer> sortedList = new ArrayList<>();
        int k = 0;
        for (int j : arr2) {
            for (int value : arr1) {
                if (j == value) {
                    sortedList.add(j);
                }
            }
        }
        int starindex = sortedList.size();
        ArrayList<Integer> sortedList2 = new ArrayList<>(sortedList);
        for(int i : arr1)
        {
            if(!sortedList2.contains(i))
            {
                sortedList.add(i);
            }
        }
        for(int i = starindex;i< sortedList.size();i++)
        {
            for(int j= i+1;j<sortedList.size();j++)
            {
                if(sortedList.get(i) > sortedList.get(j))
                {
                    Integer temp = sortedList.get(i);
                    sortedList.set(i,sortedList.get(j));
                    sortedList.set(j,temp);
                }
            }
        }
        for(Integer i : sortedList)
        {
            sortedArray[k++] = i;
        }
        return sortedArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter Second Array Size");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        enterElements(arr2);
        int[] sortedArray = sortArray(arr,arr2);
        for(int i : sortedArray)
        {
            System.out.print(i+" ");
        }
    }
}
