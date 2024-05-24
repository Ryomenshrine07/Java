package Arrays;

import java.util.Scanner;

public class NthMaxAndNthMin
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
    static void sortArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            int j = i - 1;
            while(j>=0&&num<arr[j])
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = num;
        }
    }
    static int diffrence(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth Element");
        int n = sc.nextInt();
        int maxElement = arr[arr.length - n];
        int minElement = arr[n-1];
        return (maxElement - minElement);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        sortArray(arr);
        int diff = diffrence(arr);
        System.out.println("Difference is :"+diff);
    }
}
