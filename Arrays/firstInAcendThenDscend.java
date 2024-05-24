package Arrays;

import java.util.Scanner;

public class firstInAcendThenDscend
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
    static void sort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(i < (arr.length/2))
            {
                for(int j=i+1;j< (arr.length/2);j++)
                {
                    if(arr[i] > arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            else
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    if(arr[i] < arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    static void display(int[] arr)
    {
        System.out.println("Your Array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size oF array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        sort(arr);
        display(arr);
    }
}
