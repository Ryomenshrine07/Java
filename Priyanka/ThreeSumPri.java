package Priyanka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeSumPri
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static List<List<Integer>> findListOfTriplets(int[] arr)
    {
        List<List<Integer>> list = new ArrayList<>();
            for(int i=0;i< arr.length;i++)
            {
                ArrayList<Integer>tripList=new ArrayList<Integer>();
                for(int j=i+1;j< arr.length;j++)
                {
                    for(int k=j+1;k< arr.length;k++)
                    {
                        if(i!=j && j!=k && i!=k && (arr[i]+arr[j]+arr[k]==0))
                        {
                            tripList.add(arr[i]);
                            tripList.add(arr[j]);
                            tripList.add(arr[k]);
                            Collections.sort(tripList);
                            if(!list.contains(tripList))
                            {
                                list.add(tripList);
                            }
                            tripList = new ArrayList<Integer>();
                        }
                    }
                }
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
        List<List<Integer>> list =  findListOfTriplets(arr);
        System.out.println(list);
    }
}
