package Arrays;

import java.util.Scanner;

public class SecondLargest
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
    static int findSecondLargest(int[] arr)
    {
        int largest = 0;
        int secLarg = 0;
        int count = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                count++;
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > secLarg && arr[i] < largest)
            {
                count2++;
                secLarg = arr[i];
            }
        }
        if((count == 1 && count2 == 0)|| arr.length == 1)
        {
            return -1;
        }
        else
        {
            return secLarg;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size For Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int secLarg = findSecondLargest(arr);
        System.out.println("Second Largest Is : "+secLarg);
    }
}
