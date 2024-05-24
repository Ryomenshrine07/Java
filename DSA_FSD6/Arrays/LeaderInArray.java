package DSA_FSD6.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaderInArray
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
    static ArrayList<Integer> findLeader(int[] arr,int n)
    {
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] >= arr[j])
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true || i == n-1)
            {
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];

        enterElements(arr);

        ArrayList<Integer> leaders = findLeader(arr,n);
        System.out.print("Leaders are :");
        for(int i=0;i<leaders.size();i++)
        {
            System.out.print(leaders.get(i)+" ");
        }
    }
}
