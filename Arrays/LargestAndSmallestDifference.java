package Arrays;

import java.util.Scanner;

public class LargestAndSmallestDifference
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements For Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void findLargestAndSmallest(int[] arr)
    {
        int larg = 0;
        int small = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > larg)
            {
                larg = arr[i];
            }
            if(arr[i] < small && arr[i] < larg)
            {
                small = arr[i];
            }
        }
        System.out.println("Largest Element is : "+larg);
        System.out.println("Smallest Element is : "+small);
        System.out.println("Difference of Maximum And Minimum Element is :"+(larg-small));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        findLargestAndSmallest(arr);
    }
}
