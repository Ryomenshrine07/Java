package Priyanka;

import java.util.HashMap;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i]= sc.nextInt();
        }
        for(int i:nums)
        {
            hs.put(i, hs.getOrDefault(i,0)+1);
        }
        int maxElement=0;
        int maxFrequency=0;
        for(int i:hs.keySet())
        {
            int value= hs.get(i);
            if(value>maxFrequency)
            {
                maxFrequency=value;

                if(maxFrequency>nums.length/2)
                {
                    maxElement=i;
                }
            }
        }
       System.out.println(maxElement);
    }
}
