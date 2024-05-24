package Arrays;

import java.util.Scanner;

public class ReverseArray
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
    static void reverse(int[] arr)
    {
        int sp = 0;
        int end = arr.length - 1;
        int temp = 0;
        while(sp < end)
        {
            temp = arr[sp];
            arr[sp] = arr[end];
            arr[end] = temp;
            sp++;
            end--;
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
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        reverse(arr);
        display(arr);

    }
}
