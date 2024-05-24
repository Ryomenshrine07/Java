package Arrays;

import java.util.*;

public class SortByFrequency
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
    static void findFrequencyAndSort(int[] arr)
    {
        LinkedHashSet<Integer> element = new LinkedHashSet<Integer>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (!element.contains(arr[i]))
            {
                element.add(arr[i]);
                freq.add(count);
            }
        }
        ArrayList<Integer> Elements = new ArrayList<>(element);
        for(int i=0;i< freq.size();i++)
        {
            for(int j=i+1;j< freq.size();j++)
            {
                if(freq.get(i) > freq.get(j))
                {
                    int temp = freq.get(i);
                    freq.set(i, freq.get(j));
                    freq.set(j,temp);

                    int temp2 = Elements.get(i);
                    Elements.set(i,Elements.get(j));
                    Elements.set(j,temp2);

                }
            }
        }
        for(int i=0;i< Elements.size();i++)
        {
            System.out.print(Elements.get(i)+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        findFrequencyAndSort(arr);
    }
}
