package DSA_FSD6.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDisBtnTwoNum
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
    static ArrayList<Integer> putElements(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr)
        {
            list.add(i);
        }
        return list;
    }
    static int findDistance(int[] arr,int x,int y)
    {
        ArrayList<Integer> list = putElements(arr);
        if(!list.contains(x) || !list.contains(y))
        {
            return -1;
        }
        int index1 = list.indexOf(x);
        int index2 = list.indexOf(y);
        int counDis = 0;
        if(index2> index1) {
            for (int i = index1; i < index2; i++) {
                counDis++;
            }
        }
        else
        {
            for (int i = index2; i < index1; i++) {
                counDis++;
            }
        }
        return counDis;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();
        int dis = findDistance(arr,x,y);
        System.out.println("Distance between x and y is :"+dis);
    }
}
