package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findMajorityElement(int[] arr)
    {
        HashMap<Integer,Integer> Hmap = new HashMap<Integer, Integer>();
        for(int i : arr)
        {
            Hmap.put(i,Hmap.getOrDefault(i,0)+1);
        }
        int maxFrequency = 0;
        int maxElement = 0;
        for(int i : Hmap.keySet())
        {
            int value = Hmap.get(i);
            if(value > maxFrequency)
            {
                maxFrequency = value;
                if(maxFrequency > arr.length/2)
                {
                    maxElement = i;
                }
            }
        }
        return maxElement;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        enterElement(arr);
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority Element is :"+majorityElement);
    }
}
