package Arrays;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FrequencyOfElements
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
    static void calculateFrequencies(int[] arr , int n)
    {
        LinkedHashSet<Integer> element = new LinkedHashSet<>();
        ArrayList<Integer> frequency = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            element.add(arr[i]);
            frequency.add(count);
        }
        showFrequencies(element,frequency);
    }
    static void showFrequencies(LinkedHashSet<Integer> element , ArrayList<Integer> frequency)
    {
        Iterator<Integer> it = element.iterator();
        for(int i=0;i<element.size();i++)
        {
            System.out.println("Element :"+it.next()+" Frequency :"+frequency.get(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        calculateFrequencies(arr , n);
    }
}
